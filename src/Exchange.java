import java.util.Scanner;

public class Exchange {
    // Массив катионов
    static String[] cations = {"H", "Ag", "Al", "Ba", "Ca", "Co", "Cr", "Cu", "Fe",
            "K", "Li", "Mg", "Mn", "Na", "NH4", "Ni", "Pb",
            "Sn", "Sr", "Zn"};

    // Массив анионов
    static String[] anions = {"Br", "CH3COO", "Cl", "F", "I", "NO3", "NO2",
            "OH", "PO4", "S", "SO3", "SO4"};


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
            return "Final reaction: " + reactant1 + "+" + reactant2 + "→" + product1 + "+" + product2;
        } else {
            return "No reaction was detected";
        }
    }

    private static boolean isSalt(String compound) {
        for (String cation : cations) {
            if (compound.contains(cation)) {
                for (String anion : anions) {
                    if (compound.contains(anion)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static String getCation(String salt) {
        for (String cation : cations) {
            if (salt.contains(cation)) {
                return cation;
            }
        }
        return "";
    }


    private static String getAnion(String salt) {
        for (String anion : anions) {
            if (salt.contains(anion)) {
                return anion;
            }
        }
        return "";
    }
}
