import java.io.*;

public class PrintWriterDemo {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter("printwriter.txt")) {
            writer.println("First line using PrintWriter.");
            writer.printf("Formatted: %d + %d = %d\n", 2, 3, 2+3);
            System.out.println("Data written to printwriter.txt");
        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
        }
    }
}
