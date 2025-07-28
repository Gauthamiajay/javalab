class User {
    private String username;
    protected String role;
    public int accessLevel;
    public final String COMPANY = "TechCorp"; // constant

    public User(String username, String role, int accessLevel) {
        this.username = username;
        this.role = role;
        this.accessLevel = accessLevel;
    }

    public void displayInfo() {
        System.out.println("Username: " + username);
        System.out.println("Role: " + role);
        System.out.println("Access Level: " + accessLevel);
        System.out.println("Company: " + COMPANY);
    }
}

public class AccessLogger {
    public static void main(String[] args) {
        User user1 = new User("ammu_user", "Admin", 5);
        user1.displayInfo();

        System.out.println("\nAccessing fields directly from outside the class:");
        // System.out.println("Username: " + user1.username); ❌ private - cannot access
        System.out.println("Role (protected): " + user1.role); // ✔ same package
        System.out.println("Access Level (public): " + user1.accessLevel); // ✔
        
        // user1.COMPANY = "NewCorp"; ❌ final variable - cannot be changed
    }
}
