import Reactions.Reactions_Decomposition;

import java.util.Scanner;

public class Decomposition {
    public static void main(String firstProduct) {
        String result = getReactionResult(firstProduct);
        if (result != null) {
            String[] products = result.contains("/") ? result.split("/") : new String[]{result};
            for (int i = 0; i < products.length; i++) {
                System.out.println("Final reaction " + (i + 1) + ": " + products[i]);
            }
        } else {
            System.out.println("No reaction was detected");
        }
    }

    private static String getReactionResult(String product1) {
        String[][][] allReactions = {Reactions_Decomposition.reaction_decomposition};
        for (String[][] reactions : allReactions) {
            for (String[] reaction : reactions) {
                if (reaction[0].equals(product1)){
                    return reaction[1];
                }
            }
        }
        return null;
    }
}
