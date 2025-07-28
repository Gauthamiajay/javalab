// Abstract class - Abstraction
abstract class BankAccount {
    private double balance; // Encapsulation

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Getters and Setters - Encapsulation
    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // Abstract Methods - Abstraction
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}

// SavingsAccount - Inheritance
class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Savings: Deposited " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Savings: Withdrawn " + amount);
        } else {
            System.out.println("Savings: Insufficient funds.");
        }
    }
}

// CurrentAccount - Inheritance
class CurrentAccount extends BankAccount {
    private double overdraftLimit = 5000;

    public CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Current: Deposited " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() + overdraftLimit >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Current: Withdrawn " + amount);
        } else {
            System.out.println("Current: Overdraft limit exceeded.");
        }
    }
}

// Main class
public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1000);
        CurrentAccount ca = new CurrentAccount(2000);

        sa.deposit(500);
        sa.withdraw(1200);
        System.out.println("Savings Balance: " + sa.getBalance());

        System.out.println();

        ca.deposit(1000);
        ca.withdraw(3500);
        System.out.println("Current Balance: " + ca.getBalance());
    }
}
