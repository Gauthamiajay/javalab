import java.util.Scanner;

class Transaction {
    String from;
    String to;
    double amount;

    Transaction(String from, String to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    void printDetails() {
        System.out.println("Transferred ₹" + amount + " from " + from + " to " + to);
    }
}

class BankAccount {
    String name;
    double balance;
    static int accountCount = 0;

    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
        accountCount++;
    }

    Transaction transferTo(BankAccount receiver, double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            receiver.balance += amount;
            return new Transaction(this.name, receiver.name, amount);
        } else {
            System.out.println("Insufficient balance for " + name);
            return null;
        }
    }

    void printAccount() {
        System.out.println("Account Holder: " + name + ", Balance: ₹" + balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get details for first account
        System.out.print("Enter name for Account 1: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter opening balance for Account 1: ₹");
        double balance1 = scanner.nextDouble();
        scanner.nextLine(); // consume leftover newline

        // Get details for second account
        System.out.print("Enter name for Account 2: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter opening balance for Account 2: ₹");
        double balance2 = scanner.nextDouble();

        // Create bank accounts
        BankAccount acc1 = new BankAccount(name1, balance1);
        BankAccount acc2 = new BankAccount(name2, balance2);

        System.out.println("\nInitial Account Details:");
        acc1.printAccount();
        acc2.printAccount();

        // Transaction input
        System.out.print("\nEnter amount to transfer from " + name1 + " to " + name2 + ": ₹");
        double transferAmount = scanner.nextDouble();

        System.out.println("\nPerforming Transaction...");
        Transaction t = acc1.transferTo(acc2, transferAmount);

        if (t != null) {
            t.printDetails();
        }

        System.out.println("\nUpdated Account Details:");
        acc1.printAccount();
        acc2.printAccount();

        System.out.println("\nTotal Bank Accounts Created: " + BankAccount.accountCount);

        scanner.close();
    }
}
