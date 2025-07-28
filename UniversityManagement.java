// Abstract class
abstract class Person {
    // Encapsulation: Private fields
    private String name;
    private int id;

    // Constructor
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getters (Encapsulation)
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // Abstract method to be overridden (Abstraction)
    public abstract String getRole();
}

// Subclass: Student (Inheritance)
class Student extends Person {
    public Student(String name, int id) {
        super(name, id);
    }

    // Implement abstract method
    public String getRole() {
        return "Student";
    }
}

// Subclass: Professor (Inheritance)
class Professor extends Person {
    public Professor(String name, int id) {
        super(name, id);
    }

    // Implement abstract method
    public String getRole() {
        return "Professor";
    }
}

// Main class
public class UniversityManagement {
    public static void main(String[] args) {
        // Create a student and a professor
        Student student = new Student("Ammu", 101);
        Professor professor = new Professor("Dr. Ravi", 501);

        // Display their details
        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getId());
        System.out.println("Role: " + student.getRole());

        System.out.println();

        System.out.println("Professor Details:");
        System.out.println("Name: " + professor.getName());
        System.out.println("ID: " + professor.getId());
        System.out.println("Role: " + professor.getRole());
    }
}
