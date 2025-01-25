import Reactions.Reactions_Compound
fun mainCompound(firstProduct: String, secondProduct: String) {
    val result = getReactionResult(firstProduct, secondProduct)
    if (result != null) {
        val products = if (result.contains("/")) result.split("/") else listOf(result)
        products.forEachIndexed { index, product ->
            println("Final reaction ${index + 1}: $product")
        }
    } else {
        println("No reaction was detected")
    }
}

private fun getReactionResult(product1: String, product2: String): String? {
    val allReactions = arrayOf(
        Reactions_Compound.reaction_compound_H,
        Reactions_Compound.reaction_compound_Li,
        Reactions_Compound.reaction_compound_Be,
        Reactions_Compound.reaction_compound_B,
        Reactions_Compound.reaction_compound_C,
        Reactions_Compound.reaction_compound_N,
        Reactions_Compound.reaction_compound_O,
        Reactions_Compound.reaction_compound_F
    )
    for (reactions in allReactions) for (reaction in reactions)
        if ((reaction[0] == product1 && reaction[1] == product2) || (reaction[0] == product2 && reaction[1] == product1)) return reaction[2]
    return null
}
