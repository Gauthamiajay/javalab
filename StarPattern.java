public class StarPattern {
    public static void main(String[] args) {
        int rows = 5;  // Total number of rows

        for (int i = 1; i <= rows; i++) {  // Outer loop for rows
            for (int j = 1; j <= i; j++) {  // Inner loop for stars in each row
                System.out.print("* ");
            }
            System.out.println();  // Move to the next line
        }
    }
}
