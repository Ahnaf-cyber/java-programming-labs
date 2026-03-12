public class YouthAccount extends Account {

    private int age;

    public YouthAccount(String o, double b, int a) {
        super(o, b);
        age = a;
    }

    public void bonus() {
        balance = balance + 10;  // simple bonus
    }

    public String toString() {
        return super.toString() + ", Age: " + age;
    }
}
