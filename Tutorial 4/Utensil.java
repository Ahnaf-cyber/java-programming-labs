public class Utensil extends Product {
    private String material;

    public Utensil(String name, double price, String material) {
        super(name, price);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public double getTax() {
        return getPrice() * 0.05;
    }

    @Override
    public String getDetails() {
        return "Material: " + material;
    }
}
