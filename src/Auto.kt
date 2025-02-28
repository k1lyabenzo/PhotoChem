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

    var firstProductIndex = "H"
    var secondProductIndex = "H"

    for (reaction in tableExchange) {
        if (reaction[0] == firstProductModified){
            foundHardFirst = true
            firstProductIndex = reaction[1]}
        if (reaction[0] == secondProduct){
            foundHardSecond = true
            secondProductIndex = reaction[1]}
    }

    if ((foundHardSecond && foundHardFirst) && (firstProductIndex=="P" && secondProductIndex=="P")) main(firstProductModified, secondProduct)
    else mainOther(firstProductModified, secondProduct)
}
