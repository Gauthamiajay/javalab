import java.util.Scanner;

public class ExceptionHandlingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int intVal = 0;
        float floatVal = 0;
        double doubleVal = 0;
        char charVal = ' ';
        String stringVal = "";

        // Integer input
        while (true) {
            try {
                System.out.print("Enter an integer: ");
                intVal = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println(" Invalid integer. Try again.");
            }
        }

        // Float input
        while (true) {
            try {
                System.out.print("Enter a float: ");
                floatVal = Float.parseFloat(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println(" Invalid float. Try again.");
            }
        }

        // Double input
        while (true) {
            try {
                System.out.print("Enter a double: ");
                doubleVal = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println(" Invalid double. Try again.");
            }
        }

        // Character input
        while (true) {
            try {
                System.out.print("Enter a character: ");
                String input = sc.nextLine();
                if (input.length() == 1) {
                    charVal = input.charAt(0);
                    break;
                } else {
                    throw new Exception("More than one character entered.");
                }
            } catch (Exception e) {
                System.out.println(" Invalid character. Please enter exactly one character.");
            }
        }

        // String input
        System.out.print("Enter a string: ");
        stringVal = sc.nextLine();

        // Output
        System.out.println("\n --- You Entered ---");
        System.out.println("Integer   : " + intVal);
        System.out.println("Float     : " + floatVal);
        System.out.println("Double    : " + doubleVal);
        System.out.println("Character : " + charVal);
        System.out.println("String    : " + stringVal);

        sc.close();
    }
}
