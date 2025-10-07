import java.util.Scanner;

public class StudentDetailsWithExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "";
        float marks = 0;
        int rollNumber = 0;
        char division = ' ';
        String address = "";

        // Name input
        System.out.print("Enter student name: ");
        name = sc.nextLine();

        // Roll Number input
        while (true) {
            try {
                System.out.print("Enter roll number (integer): ");
                rollNumber = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println(" Invalid input. Please enter a valid integer.");
            }
        }

        // Marks input
        while (true) {
            try {
                System.out.print("Enter marks (float): ");
                marks = Float.parseFloat(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println(" Invalid input. Please enter valid float marks.");
            }
        }

        // Division input
        while (true) {
            System.out.print("Enter division (single character A/B/C): ");
            String input = sc.nextLine();
            if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
                division = input.charAt(0);
                break;
            } else {
                System.out.println(" Please enter a single alphabet character.");
            }
        }

        // Address input
        System.out.print("Enter address: ");
        address = sc.nextLine();

        // Output
        System.out.println("\n --- Student Details ---");
        System.out.println("Name     : " + name);
        System.out.println("Roll No  : " + rollNumber);
        System.out.println("Marks    : " + marks);
        System.out.println("Division : " + division);
        System.out.println("Address  : " + address);

        sc.close();
    }
}
