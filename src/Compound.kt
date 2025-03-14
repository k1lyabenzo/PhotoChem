import Reactions.Reactions_Compound
import Reactions.Reactions_Other.Third.*

fun mainCompound(firstProduct: String, secondProduct: String) {
    val result = getReactionResult(firstProduct, secondProduct)
    if (result != null) {
        result.split("/").forEach { reaction ->
            println(reaction)
        }
    } else {
        val allReactions =  arrayOf(
            Reactions_Other_3_1.other_3_1,
            Reactions_Other_3_2.other_3_2,
            Reactions_Other_3_3.other_3_3,
            Reactions_Other_3_4.other_3_4,
            Reactions_Other_3_5.other_3_5,
            Reactions_Other_3_6.other_3_6
        )
        for (reactions in allReactions) {
            for (reaction in reactions) {
                val resultArray = arrayListOf(
                    firstProduct,
                    secondProduct
                )

                if (areArraysEqualIgnoringOrder(resultArray, reaction.take(2))) {
                    println(reaction[2])
                }
            }
        }
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
