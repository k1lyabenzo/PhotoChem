fun main() {
        val input = "BaCl"
        val charAfterBa = input[2]
        if (charAfterBa.isDigit()){println("Символ '$charAfterBa' является цифрой.")}
        if (charAfterBa.isLetter()){println("Символ '$charAfterBa' является буквой.")}
}