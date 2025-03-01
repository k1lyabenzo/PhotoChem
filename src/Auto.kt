import Reactions.Reactions_Decomposition
import Reactions.Reactions_Other.Fifth.*
import Reactions.Reactions_Other.Fourth.*
import Reactions.Reactions_Other.Sixth.*
import Reactions.Reactions_Other.Third.*
import java.util.*
import kotlin.system.exitProcess

fun main() {
    val tableExchange = table
    val tableDecomposition = Reactions_Decomposition.reaction_decomposition

    val scanner = Scanner(System.`in`)
    print("Реакция: ")
    val firstProduct = scanner.nextLine().trim { it <= ' ' }

    if (!firstProduct.contains("+")) {
        for (reaction in tableDecomposition) {
            if (reaction[0] == firstProduct) {
                main(firstProduct)
                exitProcess(0)
            }
        }
        println("No decomposition reaction found for $firstProduct")
    } else {
        val resultArray = firstProduct.split("+").map { it.trim() }.filter { it.isNotEmpty() }
        val allReactions = when (resultArray.size) {
            2 -> arrayOf(
                Reactions_Other_3_1.other_3_1,
                Reactions_Other_3_2.other_3_2,
                Reactions_Other_3_3.other_3_3,
                Reactions_Other_3_4.other_3_4,
                Reactions_Other_3_5.other_3_5,
                Reactions_Other_3_6.other_3_6
            )
            3 -> arrayOf(
                Reactions_Other_4_1.other_4_1,
                Reactions_Other_4_2.other_4_2
            )
            4 -> arrayOf(
                Reactions_Other_5.other_5
            )
            5 -> arrayOf(
                Reactions_Other_6.other_6
            )
            else -> emptyArray()
        }
        for (reactions in allReactions) {
            for (reaction in reactions) {
                if (areArraysEqualIgnoringOrder(resultArray, reaction.take(resultArray.size))) {
                    println(reaction[resultArray.size])
                }
            }
        }
    }
}
fun areArraysEqualIgnoringOrder(array1: List<String>, array2: List<String>): Boolean {
    return array1.toSet() == array2.toSet()
}