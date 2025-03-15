import Reactions.Reactions_Decomposition
import Reactions.Reactions_Other.Fifth.*
import Reactions.Reactions_Other.Fourth.*
import Reactions.Reactions_Other.Sixth.*

fun main() {
    val tableDecomposition = Reactions_Decomposition.reaction_decomposition
    print("Реакция: ")
    val input = readLine()?.trim() ?: ""
    val reactions = mutableListOf<String>()

    if ("+" !in input) {
        tableDecomposition.find { it[0] == input }?.let { main(input); return }
    } else {
        val compounds = input.split("+").map { it.trim() }.filter { it.isNotEmpty() }
        when (compounds.size) {
            2 -> mainCompound(compounds[0], compounds[1])
            in 3..5 -> listOf(
                3 to arrayOf(Reactions_Other_4_1.other_4_1, Reactions_Other_4_2.other_4_2),
                4 to arrayOf(Reactions_Other_5.other_5),
                5 to arrayOf(Reactions_Other_6.other_6)
            ).find { it.first == compounds.size }?.second?.forEach { list ->
                list.forEach { reaction ->
                    if (compounds.toSet() == reaction.take(compounds.size).toSet()) {
                        reactions.add(reaction[compounds.size])
                    }
                }
            }
            else -> println("Unsupported number of compounds")
        }
    }

    if (reactions.isNotEmpty()) {
        println("Найденные реакции:")
        reactions.distinct().forEach { reaction ->
            println(mainBalancer(reaction)) // Вызываем mainBalancer и выводим результат
        }
    }
}

fun areArraysEqualIgnoringOrder(array1: List<String>, array2: List<String>) =
    array1.toSet() == array2.toSet()