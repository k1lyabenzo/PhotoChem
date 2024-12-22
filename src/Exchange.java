import java.util.Scanner;

public class Exchange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод первого реагента
        System.out.print("Product A: ");
        String reactant1 = scanner.nextLine().trim();
        if (reactant1.contains("H2O")) reactant1="HOH";

        // Ввод второго реагента
        System.out.print("Product B: ");
        String reactant2 = scanner.nextLine().trim();
        if (reactant2.contains("H2O")) reactant2="HOH";

        // Определение возможной реакции
        String reaction = determineReaction(reactant1, reactant2);
        System.out.println(reaction);
    }

    private static String determineReaction(String reactant1, String reactant2) {
        // Пример простого определения типов реагентов
        if (isSalt(reactant1) && isSalt(reactant2)) {
            // Обменная реакция между двумя солями
            String product1 = getCation(reactant1) + getAnion(reactant2);
            String product2 = getCation(reactant2) + getAnion(reactant1);
            if (product2.contains("HOH")) product2="H2O";
            if (product1.contains("HOH")) product1="H2O";
            if (reactant2.contains("HOH")) reactant2="H2O";
            if (reactant1.contains("HOH")) reactant1="H2O";
            return "Final reaction: " + reactant1 + " + " + reactant2 + " -> " + product1 + " + " + product2;
        } else {
            return "No reaction was detected";
        }
    }

    private static boolean isSalt(String compound) {
        // Простейшая проверка на соль (можно расширить)
        return compound.contains("Na") || compound.contains("K") || compound.contains("Cl") || compound.contains("SO4") || compound.contains("HOH");
    }

    private static String getCation(String salt) {
        // Получение катиона (можно улучшить для более сложных соединений)
        if (salt.contains("Na")) return "Na";
        if (salt.contains("K")) return "K";
        if (salt.contains("H")) return "H";
        return "";
    }

    private static String getAnion(String salt) {
        // Получение аниона (можно улучшить для более сложных соединений)
        if (salt.contains("Br")) return "Br";
        if (salt.contains("CH3COO")) return "CH3COO";
        if (salt.contains("Cl")) return "Cl";
        if (salt.contains("F")) return "F";
        if (salt.contains("I")) return "I";
        if (salt.contains("NO3")) return "NO3";
        if (salt.contains("NO2")) return "NO2";
        if (salt.contains("OH")) return "OH";
        if (salt.contains("PO4")) return "PO4";
        if (salt.contains("S")) return "S";
        if (salt.contains("SO3")) return "SO3";
        if (salt.contains("SO4")) return "SO4";
        return "";
    }
}
