public class JointAccount extends Account {

    private String partner;

    public JointAccount(String o1, String o2, double b) {
        super(o1, b);
        partner = o2;
    }

    public String toString() {
        return super.toString() + ", Partner: " + partner;
    }
}
