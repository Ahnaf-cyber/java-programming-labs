public class Part {

    private String name;
    private String description;
    private double price;
    private int quantity;

    // Constructor
    public Part(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = 0; // will be set later
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setter for quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

  
    @Override
    public String toString() {
        return "Part Name: " + name +
               "\nDescription: " + description +
               "\nPrice: $" + price +
               "\nQuantity in Stock: " + quantity +
               "\n---------------------------";
    }
}
