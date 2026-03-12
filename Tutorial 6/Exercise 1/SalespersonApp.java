import java.util.Scanner;

public class SalespersonApp {

    public static void main(String[] args) {

        Salesperson[] database = new Salesperson[20];
        int count = 0;

        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Salesperson Database ===");
            System.out.println("1. Add Record");
            System.out.println("2. Delete Record");
            System.out.println("3. Change Record");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1: // ADD
                    if (count == database.length) {
                        System.out.println("Error: Database is full.");
                        break;
                    }

                    System.out.print("Enter ID: ");
                    int id = input.nextInt();

                    if (findIndex(database, count, id) != -1) {
                        System.out.println("Error: ID already exists.");
                        break;
                    }

                    System.out.print("Enter annual sales: ");
                    double sales = input.nextDouble();

                    database[count++] = new Salesperson(id, sales);
                    System.out.println("Record added successfully.");
                    break;

                case 2: // DELETE
                    if (count == 0) {
                        System.out.println("Error: Database is empty.");
                        break;
                    }

                    System.out.print("Enter ID to delete: ");
                    id = input.nextInt();

                    int index = findIndex(database, count, id);
                    if (index == -1) {
                        System.out.println("Error: ID not found.");
                        break;
                    }

                    database[index] = database[count - 1];
                    database[count - 1] = null;
                    count--;

                    System.out.println("Record deleted.");
                    break;

                case 3: // CHANGE
                    if (count == 0) {
                        System.out.println("Error: Database is empty.");
                        break;
                    }

                    System.out.print("Enter ID to change: ");
                    id = input.nextInt();

                    index = findIndex(database, count, id);
                    if (index == -1) {
                        System.out.println("Error: ID not found.");
                        break;
                    }

                    System.out.print("Enter new annual sales: ");
                    sales = input.nextDouble();
                    database[index].setAnnualSales(sales);

                    System.out.println("Record updated.");
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (choice != 4);

        input.close();
    }

    private static int findIndex(Salesperson[] db, int count, int id) {
        for (int i = 0; i < count; i++) {
            if (db[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
