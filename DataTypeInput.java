import java.util.Scanner;

public class DataTypeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Integer
        System.out.print("Enter an integer: ");
        int intVal = sc.nextInt();

        // Float
        System.out.print("Enter a float: ");
        float floatVal = sc.nextFloat();

        // Double
        System.out.print("Enter a double: ");
        double doubleVal = sc.nextDouble();

        // Clear the input buffer (important before reading character and string)
        sc.nextLine();

        // Character (read as string and take first char)
        System.out.print("Enter a character: ");
        char charVal = sc.nextLine().charAt(0);

        // String
        System.out.print("Enter a string: ");
        String stringVal = sc.nextLine();

        // Display entered values
        System.out.println("\n--- You Entered ---");
        System.out.println("Integer: " + intVal);
        System.out.println("Float: " + floatVal);
        System.out.println("Double: " + doubleVal);
        System.out.println("Character: " + charVal);
        System.out.println("String: " + stringVal);

        sc.close();
    }
}
