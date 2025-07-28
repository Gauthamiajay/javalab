// Abstract class - Abstraction
abstract class Staff {
    private String name;          // Encapsulation
    private double baseSalary;

    public Staff(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getters - Encapsulation
    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    // Abstract Method - Abstraction
    public abstract double calculateSalary();

    // Common Method to Display Details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Base Salary: ₹" + baseSalary);
        System.out.println("Total Salary: ₹" + calculateSalary());
    }

    // Optional: Method to display role/type
    public void getType() {
        System.out.println("Role: " + this.getClass().getSimpleName());
    }
}

// Doctor class - Inheritance
class Doctor extends Staff {
    private int surgeriesPerformed;

    public Doctor(String name, double baseSalary, int surgeriesPerformed) {
        super(name, baseSalary);
        this.surgeriesPerformed = surgeriesPerformed;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (surgeriesPerformed * 1000);
    }
}

// Nurse class - Inheritance
class Nurse extends Staff {
    private int nightShifts;

    public Nurse(String name, double baseSalary, int nightShifts) {
        super(name, baseSalary);
        this.nightShifts = nightShifts;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (nightShifts * 500);
    }
}

// AdminStaff class - Inheritance
class AdminStaff extends Staff {
    private double performanceBonus;

    public AdminStaff(String name, double baseSalary, double performanceBonus) {
        super(name, baseSalary);
        this.performanceBonus = performanceBonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + performanceBonus;
    }
}

// Main class
public class HospitalSystem {
    public static void main(String[] args) {
        Staff s1 = new Doctor("Dr. Meera", 50000, 5);
        Staff s2 = new Nurse("Sister Rani", 25000, 4);
        Staff s3 = new AdminStaff("John", 30000, 2000);

        System.out.println("--------- DOCTOR ---------");
        s1.displayDetails();
        s1.getType();

        System.out.println("--------- NURSE ----------");
        s2.displayDetails();
        s2.getType();

        System.out.println("------ ADMIN STAFF -------");
        s3.displayDetails();
        s3.getType();
    }
}
