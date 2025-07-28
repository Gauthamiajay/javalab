import java.util.Scanner;

public class MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();

        System.out.println("Choose Operation:\n1. Add\n2. Subtract\n3. Multiply\n4. Divide");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Sum = " + (a + b));
                break;
            case 2:
                System.out.println("Difference = " + (a - b));
                break;
            case 3:
                System.out.println("Product = " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Quotient = " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
