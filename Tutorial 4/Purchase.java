public class Purchase {
    private Product[] items = new Product[4];
    private int count = 0;

    public void addToPurchase(Product product) {
        if (count < 4) {
            items[count] = product;
            count++;
        } else {
            System.out.println("Purchase already has 4 items.");
        }
    }

    public void produceDocket() {
        double totalTax = 0;
        double totalPrice = 0;

        System.out.println("<<------ DOCKET ------>>");

        for (int i = 0; i < count; i++) {
            Product p = items[i];
            double tax = p.getTax();

            System.out.printf(
    "%s | $%.2f | Tax: $%.2f | %s%n",
            p.getName(),
            p.getPrice(),
            tax,
            p.getDetails()
        );


            totalTax += tax;
            totalPrice += p.getPrice();
        }

        System.out.println("<<-------------------->>");
        System.out.println("Total Tax: $" + totalTax);
        System.out.println("Total Due: $" + (totalPrice + totalTax));
    }
}
