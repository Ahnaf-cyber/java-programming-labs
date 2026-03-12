public class SportsVenuePass {

    private static int lastId = 0;
    private int passId;
    private boolean used;
    public SportsVenuePass() {
        lastId = lastId + 1;
        passId = lastId;
        used = false;
    }
    public void useThisPass() {
        used = true;
    }
    public String toString() {
        return "Pass ID: " + passId + ", Used: " + used;
    }
    public static void main(String[] args) {
        SportsVenuePass p1 = new SportsVenuePass();
        SportsVenuePass p2 = new SportsVenuePass();

        System.out.println(p1);
        System.out.println(p2);
        p1.useThisPass();

        System.out.println("After using p1:");
        System.out.println(p1);
    }
}
