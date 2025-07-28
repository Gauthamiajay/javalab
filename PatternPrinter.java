import java.util.Scanner;

public class PatternPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;

        System.out.println("=== Pattern Printing Program ===");
        System.out.println("1. Right-Angled Triangle");
        System.out.println("2. Inverted Triangle");
        System.out.println("3. Pyramid Pattern");
        System.out.println("4. Diamond Pattern");
        System.out.println("5. Number Triangle");
        System.out.print("Enter your choice (1–5): ");
        int choice = sc.nextInt();

        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();

        System.out.println();

        switch (choice) {
            case 1:
                // Right-Angled Triangle
                for (int i = 1; i <= rows; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;

            case 2:
                // Inverted Triangle
                for (int i = rows; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;

            case 3:
                // Pyramid Pattern
                for (int i = 1; i <= rows; i++) {
                    for (int j = i; j < rows; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= (2 * i - 1); k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 4:
                // Diamond Pattern
                for (int i = 1; i <= rows; i++) {
                    for (int j = i; j < rows; j++) System.out.print(" ");
                    for (int k = 1; k <= (2 * i - 1); k++) System.out.print("*");
                    System.out.println();
                }
                for (int i = rows - 1; i >= 1; i--) {
                    for (int j = rows; j > i; j--) System.out.print(" ");
                    for (int k = 1; k <= (2 * i - 1); k++) System.out.print("*");
                    System.out.println();
                }
                break;

            case 5:
                // Number Triangle
                int num = 1;
                for (int i = 1; i <= rows; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(num++ + " ");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid choice! Please run again.");
        }

        sc.close();
    }
}
