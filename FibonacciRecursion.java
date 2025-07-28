import java.util.Scanner;

public class FibonacciRecursion {
    static int count = 0; // static counter to count recursive calls

    static int fibonacci(int n) {
        count++;
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many Fibonacci numbers to print: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        System.out.println("\nTotal recursive calls made: " + count);
        sc.close();
    }
