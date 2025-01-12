import Reactions.Reactions_Compound;

import java.util.*;

public class Compound {

    public static void main(String firstProduct, String secondProduct) {
        String result = getReactionResult(firstProduct, secondProduct);
        if (result != null) {
            String[] products = result.contains("/") ? result.split("/") : new String[]{result};
            for (int i = 0; i < products.length; i++) {
                System.out.println("Final reaction " + (i + 1) + ": " + products[i]);
            }
        } else {
            System.out.println("No reaction was detected");
        }
    }

    private static String getReactionResult(String product1, String product2) {
        String[][][] allReactions = {Reactions_Compound.reaction_compound_H, Reactions_Compound.reaction_compound_Li,
                Reactions_Compound.reaction_compound_Be, Reactions_Compound.reaction_compound_B, Reactions_Compound.reaction_compound_C,
                Reactions_Compound.reaction_compound_N, Reactions_Compound.reaction_compound_O, Reactions_Compound.reaction_compound_F};
        for (String[][] reactions : allReactions) {
            for (String[] reaction : reactions) {
                if ((reaction[0].equals(product1) && reaction[1].equals(product2)) ||
                        (reaction[0].equals(product2) && reaction[1].equals(product1))) {
                    return reaction[2];
                }
            }
        }
        return null;
    }
}
