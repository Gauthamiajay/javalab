import java.util.Scanner;

class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: ₹" + salary);
    }

    void updateSalary(double newSalary) {
        this.salary = newSalary;
        System.out.println("Salary updated for " + name);
    }
}

public class EmployeeRegistry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many employees? ");
        int n = sc.nextInt();
        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));
            System.out.print("Name: ");
            sc.nextLine(); // consume newline
            String name = sc.nextLine();
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            employees[i] = new Employee(name, id, salary);
        }

        System.out.println("\nEmployee Details:");
        for (Employee e : employees) {
            e.display();
        }

        System.out.print("\nEnter ID to update salary: ");
        int updateId = sc.nextInt();
        System.out.print("Enter new salary: ");
        double newSalary = sc.nextDouble();

        boolean found = false;
        for (Employee e : employees) {
            if (e.id == updateId) {
                e.updateSalary(newSalary);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee ID not found.");
        }

        System.out.println("\nUpdated Employee List:");
        for (Employee e : employees) {
            e.display();
        }

        sc.close();
    }
}
