import java.util.*;

public class Compound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первый химический продукт: ");
        String firstProduct = scanner.nextLine().trim();

        System.out.print("Введите второй химический продукт: ");
        String secondProduct = scanner.nextLine().trim();

        String result = getReactionResult(firstProduct, secondProduct);
        if (result != null) {
            String[] products = result.contains("/") ? result.split("/") : new String[]{result};
            for (int i = 0; i < products.length; i++) {
                System.out.println("Продукт " + (i + 1) + ": " + products[i]);
            }
        } else {
            System.out.println("Нет известной реакции между данными продуктами.");
        }

        scanner.close();
    }

    private static String getReactionResult(String product1, String product2) {
        List<String[]> allReactions = new ArrayList<>();
        Collections.addAll(allReactions, Reactions.reaction_compare_H);
        Collections.addAll(allReactions, Reactions.reaction_compare_Li);
        Collections.addAll(allReactions, Reactions.reaction_compare_Be);
        Collections.addAll(allReactions, Reactions.reaction_compare_B);
        Collections.addAll(allReactions, Reactions.reaction_compare_C);
        Collections.addAll(allReactions, Reactions.reaction_compare_N);
        for (String[] reaction : allReactions) {
            if ((reaction[0].equals(product1) && reaction[1].equals(product2)) ||
                    (reaction[0].equals(product2) && reaction[1].equals(product1))) {
                return reaction[2];
            }
        }
        return null;
    }
}
