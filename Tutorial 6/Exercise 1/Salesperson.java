public class Salesperson {

    private int id;
    private double annualSales;

    public Salesperson(int id, double annualSales) {
        this.id = id;
        this.annualSales = annualSales;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAnnualSales() {
        return annualSales;
    }

    public void setAnnualSales(double annualSales) {
        this.annualSales = annualSales;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Annual Sales: $" + annualSales;
    }
}
