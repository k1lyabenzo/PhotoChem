import java.util.Scanner;
//11
public class Compound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первый химический продукт: ");
        String product1 = scanner.nextLine().trim();

        System.out.print("Введите второй химический продукт: ");
        String product2 = scanner.nextLine().trim();

        String result = getReactionResult(product1, product2);
        if (result != null) {
            System.out.print("Реакция найдена: " + result);
        } else {
            System.out.println("Нет известной реакции между этими продуктами.");
        }

        scanner.close();
    }

    private static String getReactionResult(String product1, String product2) {
        // Проверяем все реакции в массиве
        for (String[] reaction : Reactions.reaction_compare_H) {
            String reactant1 = reaction[0];
            String reactant2 = reaction[1];
            String reactionEquation = reaction[2];

            // Проверяем реакцию в обоих порядках
            if ((product1.equals(reactant1) && product2.equals(reactant2)) ||
                    (product1.equals(reactant2) && product2.equals(reactant1))) {
                return reactionEquation;
            }
        }
        return null; // Если реакция не найдена
    }
}