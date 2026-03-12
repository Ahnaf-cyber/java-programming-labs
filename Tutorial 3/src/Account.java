//This is parent class.
public class Account {
    protected String owner;
    protected double balance;
    public Account(String o, double b) {
        owner = o;
        balance = b;
    }
    public void deposit(double a) {
        balance = balance + a;
    }
    public void withdraw(double a) {
        if (balance >= a) {
            balance = balance - a;
        }
    }
    public String toString() {
        return "Owner: " + owner + ", Balance: " + balance;
    }
}
