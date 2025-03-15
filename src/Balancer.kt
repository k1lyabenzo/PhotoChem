import java.io.BufferedReader
import java.io.InputStreamReader

fun mainBalancer(formula: String): String {
    val command = listOf("node", "src/chem.js", formula)

    val process = ProcessBuilder(*command.toTypedArray())
        .redirectOutput(ProcessBuilder.Redirect.PIPE)
        .redirectError(ProcessBuilder.Redirect.PIPE)
        .start()

    val reader = BufferedReader(InputStreamReader(process.inputStream))

    // Собираем весь вывод команды
    val result = StringBuilder()
    reader.lineSequence().forEach { line ->
        result.append(line).append("\n") // Добавляем каждую строку к результату
    }

    // Ждём завершения процесса
    process.waitFor()

    // Возвращаем собранную строку
    return result.toString().trim() // Удаляем лишние пробелы и переносы строки
}