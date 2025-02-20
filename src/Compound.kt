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
        Reactions_Compound.reaction_compound_F,
        Reactions_Compound.reaction_compound_Na,
        Reactions_Compound.reaction_compound_Mg,
        Reactions_Compound.reaction_compound_Al,
        Reactions_Compound.reaction_compound_Si,
        Reactions_Compound.reaction_compound_P,
        Reactions_Compound.reaction_compound_S,
        Reactions_Compound.reaction_compound_Cl,
        Reactions_Compound.reaction_compound_K,
        Reactions_Compound.reaction_compound_Ca,
        Reactions_Compound.reaction_compound_Ti,
        Reactions_Compound.reaction_compound_V,
        Reactions_Compound.reaction_compound_Cr,
        Reactions_Compound.reaction_compound_Fe,
        Reactions_Compound.reaction_compound_Co,
        Reactions_Compound.reaction_compound_Ni,
        Reactions_Compound.reaction_compound_Cu,
        Reactions_Compound.reaction_compound_Zn
    )
    for (reactions in allReactions) for (reaction in reactions)
        if ((reaction[0] == product1 && reaction[1] == product2) || (reaction[0] == product2 && reaction[1] == product1)) return reaction[2]
    return null
}
