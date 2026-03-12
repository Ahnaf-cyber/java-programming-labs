public class Account {
    private String ownerName;
    private double balance;

    // Constructor
    public Account(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    // Copy constructor
    public Account(Account other) {
        this.ownerName = other.ownerName;
        this.balance = other.balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // toString method
    public String toString() {
        return "Owner: " + ownerName + ", Balance: $" + balance;
    }

    // equals method
    public boolean equals(Account other) {
        return ownerName.equals(other.ownerName) && balance == other.balance;
    }
}
