import java.io.IOException;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ComputerShop shop = new ComputerShop();

        try {
            shop.loadPartsData("parts.txt");
        } catch (IOException e) {
            System.out.println("Error: Cannot read parts.txt file.");
            return;
        }

        int choice;

        do {
            System.out.println("\n--- Computer Shop Menu ---");
            System.out.println("1. Show all parts");
            System.out.println("2. Generate parts report");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    shop.showParts();
                    break;

                case 2:
                    try {
                        shop.reportParts();
                    } catch (IOException e) {
                        System.out.println("Error writing report file.");
                    }
                    break;

                case 3:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 3);

        input.close();
    }
}
