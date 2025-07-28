import java.util.Scanner;

public class AgeCheckMethod {

    public static int checkAge(int age) {
        if (age < 18) {
            return 0; 
        } else {
            return 1; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        int result = checkAge(age);

        if (result == 1) {
            System.out.println("You are Older One.");
        } else {
            System.out.println("You are below 18 and Young One.");
        }
    }
}

