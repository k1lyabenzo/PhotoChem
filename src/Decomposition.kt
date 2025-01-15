import Reactions.Reactions_Decomposition

fun main(firstProduct: String) {
    val result = getReactionResult(firstProduct)

    if (result != null) {
        val products = if (result.contains("/")) result.split("/") else listOf(result)
        for ((index, product) in products.withIndex()) {
            println("Финальная реакция ${index + 1}: $product")
        }
    } else {
        println("Реакция не обнаружена")
    }
}

private fun getReactionResult(product1: String): String? {
    val allReactions = arrayOf(Reactions_Decomposition.reaction_decomposition)
    for (reactions in allReactions) {
        for (reaction in reactions) {
            if (reaction[0] == product1) {
                return reaction[1]
            }
        }
    }
    return null
}