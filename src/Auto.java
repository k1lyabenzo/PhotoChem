import Reactions.Reactions_Decomposition;

import java.util.Scanner;

public class Auto {
    public static void main(String[] args) {
        String[][] table_exchange = Exchange.table;
        String[][] table_decomposition = Reactions_Decomposition.reaction_decomposition;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Product A: ");
        String firstProduct = scanner.nextLine().trim();

        String firstProductModif = firstProduct.replace("+", "");

        if (!firstProduct.contains("+")) {
            for (String[] reaction : table_decomposition) {
                if (reaction[0].equals(firstProduct)) {
                    Decomposition.main(firstProduct);
                    System.exit(0);
                }
            }
            System.out.println("No decomposition reaction found for " + firstProduct);
            System.exit(0);
        }

        System.out.print("Product B: ");
        String secondProduct = scanner.nextLine().trim();
        boolean found_hard_first = false;
        boolean found_hard_second = false;

        // Проверка наличия продукта в первом столбце
        for (String[] reaction : table_exchange) {
            if (reaction[0].equals(firstProductModif)) {
                found_hard_first=true;
            }
        }
        for (String[] reaction : table_exchange) {
            if (reaction[0].equals(secondProduct)) {
                found_hard_second=true;
            }
        }
        if (found_hard_second && found_hard_first) {
            //Код для обмена
            System.out.println("Обмен");
        } else if (found_hard_first || found_hard_second){
            //Код для замещения
            System.out.println("Замещение");
        } else {
            Compound.main(firstProductModif, secondProduct);
        }
    }
}
