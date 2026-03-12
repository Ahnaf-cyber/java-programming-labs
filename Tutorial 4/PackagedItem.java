public class PackagedItem extends Product {
    private int quantity;
    private String useByDate;

    public PackagedItem(String name, double price, int quantity, String useByDate) {
        super(name, price);
        this.quantity = quantity;
        this.useByDate = useByDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getUseByDate() {
        return useByDate;
    }

    @Override
    public double getTax() {
        return getPrice() * 0.10; 
    }

    @Override
    public String getDetails() {
        return "Qty: " + quantity + ", Use-by: " + useByDate;
    }
}
