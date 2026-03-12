public class FreshFruit extends Product {
    private double weightGrams;

    public FreshFruit(String name, double price, double weightGrams) {
        super(name, price);
        this.weightGrams = weightGrams;
    }

    public double getWeightGrams() {
        return weightGrams;
    }

    @Override
    public double getTax() {
        return 0.0;
    }

    @Override
    public String getDetails() {
        return "Weight: " + weightGrams + "g";
    }
}
