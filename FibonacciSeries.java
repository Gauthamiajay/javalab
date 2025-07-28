import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many terms: ");
        int n = scanner.nextInt();

        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + " " + b + " ");

        for (int i = 3; i <= n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
}
