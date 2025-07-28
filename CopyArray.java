import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] source = new int[n];
        int[] dest = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            source[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            dest[i] = source[i];
        }

        System.out.println("Copied array:");
        for (int i = 0; i < n; i++) {
            System.out.print(dest[i] + " ");
        }
    }
}
