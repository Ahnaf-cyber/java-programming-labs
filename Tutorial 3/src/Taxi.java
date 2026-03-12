public class Taxi {
    private String make;
    private String model;
    private String reg;
    private double km;
    private boolean driving;

    public Taxi(String m1, String m2, String r) {
        make = m1;
        model = m2;
        reg = r;
        km = 0;
        driving = false;
    }
    public void setDriving(boolean d) {
        driving = d;
    }
    public void addKm(double k) {
        km = km + k;
    }

    public String toString() {
        return make + " " + model + " (" + reg + "), Km: " + km + ", Driving: " + driving;
    }
    public static void main(String[] args) {
        Taxi t = new Taxi("Toyota", "Corolla", "ABC123");

        System.out.println(t);

        t.setDriving(true);
        t.addKm(20);

        System.out.println("After driving:");
        System.out.println(t);
    }
}
