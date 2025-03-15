import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val formula = readLine()?.trim() ?: ""
    val command = listOf("node", "src/chem.js", formula)

    val process = ProcessBuilder(*command.toTypedArray())
        .redirectOutput(ProcessBuilder.Redirect.PIPE)
        .redirectError(ProcessBuilder.Redirect.PIPE)
        .start()

    val reader = BufferedReader(InputStreamReader(process.inputStream))
    val errorReader = BufferedReader(InputStreamReader(process.errorStream))

    reader.lineSequence().forEach { println(it) }
}