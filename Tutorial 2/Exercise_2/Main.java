public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account("Ahnaf Shakil", 1000);
        Account acc2 = new Account(acc1);

        acc1.deposit(500);
        acc1.withdraw(200);

        System.out.println(acc1.toString());
        System.out.println(acc2.toString());

        System.out.println("Are accounts equal? " + acc1.equals(acc2));
    }
}
