"use strict";

// Главная функция для обработки входных данных
function main() {
    const args = process.argv.slice(2); // Получаем аргументы командной строки
    if (args.length === 0) {
        console.error("Ошибка: Укажите химическое уравнение как аргумент.");
        return;
    }

    const formulaStr = args[0]; // Первый аргумент — это химическое уравнение
    try {
        const eqn = new Parser(formulaStr).parseEquation();
        let matrix = buildMatrix(eqn);
        solve(matrix);
        const coefs = extractCoefficients(matrix);
        checkAnswer(eqn, coefs);

        console.log("Сбалансированное уравнение:");
        console.log(renderEquationToText(eqn, coefs));
    } catch (e) {
        if (e instanceof ParseError || e instanceof Error) {
            console.error("Ошибка:", e.message);
        } else {
            console.error("Неизвестная ошибка:", e);
        }
    }
}

// Рендерит уравнение в текстовом формате
function renderEquationToText(eqn, coefs) {
    if (coefs.length !== eqn.leftSide.length + eqn.rightSide.length)
        throw new RangeError("Несоответствие количества коэффициентов");

    function termsToText(terms, startIdx) {
        return terms.map((term, i) => {
            const coef = coefs[startIdx + i];
            if (coef === 0) return null;
            const coefStr = coef === 1 ? "" : `${coef}`;
            return `${coefStr}${renderTermToText(term)}`;
        }).filter(Boolean).join(" + ");
    }

    const lhs = termsToText(eqn.leftSide, 0);
    const rhs = termsToText(eqn.rightSide, eqn.leftSide.length);
    return `${lhs} -> ${rhs}`;
}

// Рендерит терм в текстовом формате
function renderTermToText(term) {
    if (term.items.length === 0 && term.charge === -1) {
        return "e^-";
    }

    let result = "";
    for (const item of term.items) {
        result += item instanceof ChemElem ? renderElementToText(item) : renderGroupToText(item);
    }

    if (term.charge !== 0) {
        const sign = term.charge > 0 ? "+" : "-";
        const absCharge = Math.abs(term.charge);
        result += `^${absCharge === 1 ? "" : absCharge}${sign}`;
    }

    return result;
}

// Рендерит элемент в текстовом формате
function renderElementToText(element) {
    return `${element.name}${element.count === 1 ? "" : element.count}`;
}

// Рендерит группу в текстовом формате
function renderGroupToText(group) {
    return `(${group.items.map(item => item instanceof ChemElem ? renderElementToText(item) : renderGroupToText(item)).join("")})${group.count === 1 ? "" : group.count}`;
}

/*---- Core functionality from chemical-equation-balancer.js ----*/
class Parser {
    constructor(formulaStr) {
        this.tok = new Tokenizer(formulaStr);
    }

    parseEquation() {
        let lhs = [this.parseTerm()];
        while (true) {
            const next = this.tok.peek();
            if (next == "+") {
                this.tok.consume(next);
                lhs.push(this.parseTerm());
            } else if (next == "=") {
                this.tok.consume(next);
                break;
            } else {
                throw new ParseError("Ожидался плюс или знак равенства", this.tok.pos);
            }
        }
        let rhs = [this.parseTerm()];
        while (true) {
            const next = this.tok.peek();
            if (next === null) break;
            else if (next == "+") {
                this.tok.consume(next);
                rhs.push(this.parseTerm());
            } else {
                throw new ParseError("Ожидался плюс или конец", this.tok.pos);
            }
        }
        return new Equation(lhs, rhs);
    }

    parseTerm() {
        const startPos = this.tok.pos;
        let items = [];
        let electron = false;
        let next;
        while (true) {
            next = this.tok.peek();
            if (next == "(") items.push(this.parseGroup());
            else if (next == "e") {
                this.tok.consume(next);
                electron = true;
            } else if (next !== null && /^[A-Z][a-z]*$/.test(next)) items.push(this.parseElement());
            else if (next !== null && /^[0-9]+$/.test(next)) throw new ParseError("Недопустимый терм — число не ожидалось", this.tok.pos);
            else break;
        }
        let charge = null;
        if (next == "^") {
            this.tok.consume(next);
            next = this.tok.peek();
            if (next === null) throw new ParseError("Ожидалось число или знак", this.tok.pos);
            else {
                charge = this.parseOptionalNumber();
                next = this.tok.peek();
            }
            if (next == "+") charge = +charge;
            else if (next == "-") charge = -charge;
            else throw new ParseError("Ожидался знак", this.tok.pos);
            this.tok.take();
        }
        if (electron) {
            if (items.length > 0) throw new ParseError("Недопустимый терм — электрон должен быть отдельно", startPos, this.tok.pos);
            if (charge === null) charge = -1;
            if (charge != -1) throw new ParseError("Недопустимый терм — недопустимый заряд для электрона", startPos, this.tok.pos);
        } else {
            if (items.length == 0) throw new ParseError("Недопустимый терм — пустой", startPos, this.tok.pos);
            if (charge === null) charge = 0;
        }
        return new Term(items, charge);
    }

    parseGroup() {
        const startPos = this.tok.pos;
        this.tok.consume("(");
        let items = [];
        while (true) {
            const next = this.tok.peek();
            if (next == "(") items.push(this.parseGroup());
            else if (next !== null && /^[A-Z][a-z]*$/.test(next)) items.push(this.parseElement());
            else if (next == ")") {
                this.tok.consume(next);
                if (items.length == 0) throw new ParseError("Пустая группа", startPos, this.tok.pos);
                break;
            } else {
                throw new ParseError("Ожидался элемент, группа или закрывающая скобка", this.tok.pos);
            }
        }
        return new Group(items, this.parseOptionalNumber());
    }

    parseElement() {
        const name = this.tok.take();
        if (!/^[A-Z][a-z]*$/.test(name)) throw new Error("Ошибка утверждения");
        return new ChemElem(name, this.parseOptionalNumber());
    }

    parseOptionalNumber() {
        const next = this.tok.peek();
        if (next !== null && /^[0-9]+$/.test(next)) return checkedParseInt(this.tok.take());
        else return 1;
    }
}

class Tokenizer {
    constructor(str) {
        this.str = str.replace(/\u2212/g, "-");
        this.pos = 0;
        this.skipSpaces();
    }

    peek() {
        if (this.pos == this.str.length) return null;
        const match = /^([A-Za-z][a-z]*|[0-9]+|[+\-^=()])/.exec(this.str.substring(this.pos));
        if (match === null) throw new ParseError("Недопустимый символ", this.pos);
        return match[0];
    }

    take() {
        const result = this.peek();
        if (result === null) throw new Error("Выход за пределы последнего токена");
        this.pos += result.length;
        this.skipSpaces();
        return result;
    }

    consume(s) {
        if (this.take() != s) throw new Error("Несоответствие токена");
    }

    skipSpaces() {
        const match = /^[ \t]*/.exec(this.str.substring(this.pos));
        if (match === null) throw new Error("Ошибка утверждения");
        this.pos += match[0].length;
    }
}

class ParseError extends Error {
    constructor(message, start, end) {
        super(message);
        this.start = start;
        this.end = end;
        Object.setPrototypeOf(this, ParseError.prototype);
    }
}

class Equation {
    constructor(lhs, rhs) {
        this.leftSide = lhs.slice();
        this.rightSide = rhs.slice();
    }

    getElements() {
        const result = new Set();
        for (const item of this.leftSide.concat(this.rightSide)) item.getElements(result);
        return Array.from(result);
    }
}

class Term {
    constructor(items, charge) {
        if (items.length == 0 && charge != -1) throw new RangeError("Недопустимый терм");
        this.items = items.slice();
        this.charge = charge;
    }

    getElements(resultSet) {
        resultSet.add("e");
        for (const item of this.items) item.getElements(resultSet);
    }

    countElement(name) {
        if (name == "e") return -this.charge;
        let sum = 0;
        for (const item of this.items) sum = checkedAdd(sum, item.countElement(name));
        return sum;
    }
}

class Group {
    constructor(items, count) {
        if (count < 1) throw new RangeError("Ошибка утверждения: Количество должно быть положительным целым числом");
        this.items = items.slice();
        this.count = count;
    }

    getElements(resultSet) {
        for (const item of this.items) item.getElements(resultSet);
    }

    countElement(name) {
        let sum = 0;
        for (const item of this.items) sum = checkedAdd(sum, checkedMultiply(item.countElement(name), this.count));
        return sum;
    }
}

class ChemElem {
    constructor(name, count) {
        this.name = name;
        this.count = count;
        if (count < 1) throw new RangeError("Ошибка утверждения: Количество должно быть положительным целым числом");
    }

    getElements(resultSet) {
        resultSet.add(this.name);
    }

    countElement(n) {
        return n == this.name ? this.count : 0;
    }
}

class Matrix {
    constructor(numRows, numCols) {
        this.numRows = numRows;
        this.numCols = numCols;
        if (numRows < 0 || numCols < 0) throw new RangeError("Недопустимый аргумент");
        let row = [];
        for (let j = 0; j < numCols; j++) row.push(0);
        this.cells = [];
        for (let i = 0; i < numRows; i++) this.cells.push(row.slice());
    }

    get(r, c) {
        if (r < 0 || r >= this.numRows || c < 0 || c >= this.numCols) throw new RangeError("Индекс вне границ");
        return this.cells[r][c];
    }

    set(r, c, val) {
        if (r < 0 || r >= this.numRows || c < 0 || c >= this.numCols) throw new RangeError("Индекс вне границ");
        this.cells[r][c] = val;
    }

    swapRows(i, j) {
        if (i < 0 || i >= this.numRows || j < 0 || j >= this.numRows) throw new RangeError("Индекс вне границ");
        const temp = this.cells[i];
        this.cells[i] = this.cells[j];
        this.cells[j] = temp;
    }

    static addRows(x, y) {
        let z = [];
        for (let i = 0; i < x.length; i++) z.push(checkedAdd(x[i], y[i]));
        return z;
    }

    static multiplyRow(x, c) {
        return x.map(val => checkedMultiply(val, c));
    }

    static gcdRow(x) {
        let result = 0;
        for (const val of x) result = gcd(val, result);
        return result;
    }

    static simplifyRow(x) {
        let sign = 0;
        for (const val of x) {
            if (val != 0) {
                sign = Math.sign(val);
                break;
            }
        }
        if (sign == 0) return x.slice();
        const g = Matrix.gcdRow(x) * sign;
        return x.map(val => val / g);
    }

    gaussJordanEliminate() {
        let cells = this.cells = this.cells.map(Matrix.simplifyRow);
        let numPivots = 0;
        for (let i = 0; i < this.numCols; i++) {
            let pivotRow = numPivots;
            while (pivotRow < this.numRows && cells[pivotRow][i] == 0) pivotRow++;
            if (pivotRow == this.numRows) continue;
            const pivot = cells[pivotRow][i];
            this.swapRows(numPivots, pivotRow);
            numPivots++;
            for (let j = numPivots; j < this.numRows; j++) {
                const g = gcd(pivot, cells[j][i]);
                cells[j] = Matrix.simplifyRow(Matrix.addRows(Matrix.multiplyRow(cells[j], pivot / g), Matrix.multiplyRow(cells[i], -cells[j][i] / g)));
            }
        }
        for (let i = this.numRows - 1; i >= 0; i--) {
            let pivotCol = 0;
            while (pivotCol < this.numCols && cells[i][pivotCol] == 0) pivotCol++;
            if (pivotCol == this.numCols) continue;
            const pivot = cells[i][pivotCol];
            for (let j = i - 1; j >= 0; j--) {
                const g = gcd(pivot, cells[j][pivotCol]);
                cells[j] = Matrix.simplifyRow(Matrix.addRows(Matrix.multiplyRow(cells[j], pivot / g), Matrix.multiplyRow(cells[i], -cells[j][pivotCol] / g)));
            }
        }
    }
}

function buildMatrix(eqn) {
    let elems = eqn.getElements();
    let lhs = eqn.leftSide;
    let rhs = eqn.rightSide;
    let matrix = new Matrix(elems.length + 1, lhs.length + rhs.length + 1);
    elems.forEach((elem, i) => {
        let j = 0;
        for (const term of lhs) {
            matrix.set(i, j, term.countElement(elem));
            j++;
        }
        for (const term of rhs) {
            matrix.set(i, j, -term.countElement(elem));
            j++;
        }
    });
    return matrix;
}

function solve(matrix) {
    matrix.gaussJordanEliminate();
    function countNonzeroCoeffs(row) {
        let count = 0;
        for (let i = 0; i < matrix.numCols; i++) {
            if (matrix.get(row, i) != 0) count++;
        }
        return count;
    }
    let i;
    for (i = 0; i < matrix.numRows - 1; i++) {
        if (countNonzeroCoeffs(i) > 1) break;
    }
    if (i == matrix.numRows - 1) throw new RangeError("Решение с нулевыми коэффициентами");
    matrix.set(matrix.numRows - 1, i, 1);
    matrix.set(matrix.numRows - 1, matrix.numCols - 1, 1);
    matrix.gaussJordanEliminate();
}

function extractCoefficients(matrix) {
    const rows = matrix.numRows;
    const cols = matrix.numCols;
    if (cols - 1 > rows || matrix.get(cols - 2, cols - 2) == 0) throw new RangeError("Множество независимых решений");
    let lcm = 1;
    for (let i = 0; i < cols - 1; i++) lcm = checkedMultiply(lcm / gcd(lcm, matrix.get(i, i)), matrix.get(i, i));
    let coefs = [];
    for (let i = 0; i < cols - 1; i++) coefs.push(checkedMultiply(lcm / matrix.get(i, i), matrix.get(i, cols - 1)));
    if (coefs.every(x => x == 0)) throw new RangeError("Ошибка утверждения: Все коэффициенты нулевые");
    return coefs;
}

function checkAnswer(eqn, coefs) {
    if (coefs.length != eqn.leftSide.length + eqn.rightSide.length) throw new Error("Ошибка утверждения: Несоответствие длины");
    function isZero(x) {
        if (typeof x != "number" || isNaN(x) || Math.floor(x) != x) throw new Error("Ошибка утверждения: Не целое число");
        return x == 0;
    }
    if (coefs.every(isZero)) throw new Error("Ошибка утверждения: Все коэффициенты нулевые");
    for (const elem of eqn.getElements()) {
        let sum = 0;
        let j = 0;
        for (const term of eqn.leftSide) {
            sum = checkedAdd(sum, checkedMultiply(term.countElement(elem), coefs[j]));
            j++;
        }
        for (const term of eqn.rightSide) {
            sum = checkedAdd(sum, checkedMultiply(term.countElement(elem), -coefs[j]));
            j++;
        }
        if (sum != 0) throw new Error("Ошибка утверждения: Неправильный баланс");
    }
}

function checkedParseInt(str) {
    const result = parseInt(str, 10);
    if (isNaN(result)) throw new RangeError("Не число");
    return checkOverflow(result);
}

function checkedAdd(x, y) {
    return checkOverflow(x + y);
}

function checkedMultiply(x, y) {
    return checkOverflow(x * y);
}

function checkOverflow(x) {
    const INT_MAX = 9007199254740992;
    if (Math.abs(x) >= INT_MAX) throw new RangeError("Арифметическое переполнение");
    return x;
}

function gcd(x, y) {
    if (typeof x != "number" || typeof y != "number" || isNaN(x) || isNaN(y)) throw new Error("Недопустимый аргумент");
    x = Math.abs(x);
    y = Math.abs(y);
    while (y != 0) {
        const z = x % y;
        x = y;
        y = z;
    }
    return x;
}

main();