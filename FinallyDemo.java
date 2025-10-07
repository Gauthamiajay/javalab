public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("Resource opened");

        try {
            // Deliberate exception to simulate an error during resource use
            throw new RuntimeException("Exception occurred!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Resource closed");
        }

        System.out.println("Program continues after try-catch-finally.");
    }
}
