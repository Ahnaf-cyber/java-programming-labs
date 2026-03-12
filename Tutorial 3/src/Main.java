public class Main {
    public static void main(String[] args) {
        Account a = new Account("Ahnaf", 500);
        a.deposit(100);
        a.withdraw(50);
        System.out.println(a);
        JointAccount j = new JointAccount("Ahnaf", "Katy", 600);
        System.out.println(j);
        YouthAccount y = new YouthAccount("Arnold", 200, 16);
        y.bonus();
        System.out.println(y);
    }
}
