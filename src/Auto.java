import java.util.Scanner;

public class Auto {
    public static void main(String[] args) {
        String[][] table = Exchange.table;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Product A: ");
        String firstProduct = scanner.nextLine().trim();

        System.out.print("Product B: ");
        String secondProduct = scanner.nextLine().trim();
        boolean found = false;

        // Проверка наличия продукта в первом столбце
        for (String[] reaction : table) {
            if (reaction[0].equals(firstProduct)) {
                found=true;
            }
        }


        // Вывод результата
        if (found) {
            System.out.println(firstProduct + " найден в первом столбце.");
        } else {
            System.out.println(firstProduct + " не найден в первом столбце.");
        }
    }
}
