public class MainProgram {
    public static void main(String[] args) {

        
        FreshFruit apple = new FreshFruit("Apple", 1.50, 100);
        FreshFruit watermelon = new FreshFruit("Watermelon", 5.00, 1200);

        
        PackagedItem eggs = new PackagedItem("Eggs", 4.00, 6, "10/10/2026");
        PackagedItem chocolate = new PackagedItem("Chocolate", 3.50, 20, "01/05/2026");

      
        Utensil knife = new Utensil("Knife", 12.00, "Metal");
        Utensil spoon = new Utensil("Wooden Spoon", 6.00, "Wood");

        
        Purchase purchase = new Purchase();
        purchase.addToPurchase(apple);
        purchase.addToPurchase(eggs);
        purchase.addToPurchase(knife);
        purchase.addToPurchase(chocolate);
        purchase.produceDocket();
    }
}
