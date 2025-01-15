import Reactions.Reactions_Decomposition
import java.util.*
import kotlin.system.exitProcess

fun main() {
    val tableExchange = table
    val tableDecomposition = Reactions_Decomposition.reaction_decomposition

    val scanner = Scanner(System.`in`)
    print("Product A: ")
    val firstProduct = scanner.nextLine().trim { it <= ' ' }

    val firstProductModified = firstProduct.replace("+", "")

    if (!firstProduct.contains("+")) {
        for (reaction in tableDecomposition) {
            if (reaction[0] == firstProduct) {
                main(firstProduct)
                exitProcess(0)
            }
        }
        println("No decomposition reaction found for $firstProduct")
        exitProcess(0)
    }

    print("Product B: ")
    val secondProduct = scanner.nextLine().trim { it <= ' ' }
    var foundHardFirst = false
    var foundHardSecond = false

    // Проверка наличия продукта в первом столбце
    for (reaction in tableExchange) {
        if (reaction[0] == firstProductModified) {
            foundHardFirst = true
        }
    }
    for (reaction in tableExchange) {
        if (reaction[0] == secondProduct) {
            foundHardSecond = true
        }
    }
    if (foundHardSecond && foundHardFirst) {
        main(firstProductModified, secondProduct)
    } else if (foundHardFirst || foundHardSecond) {
        //Код для замещения
        println("Замещение")
    } else {
        mainCompound(firstProductModified, secondProduct)
    }
}
