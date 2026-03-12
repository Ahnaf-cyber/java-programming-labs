import java.text.SimpleDateFormat;
import java.util.*;

public class ShipmentManager {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Shipment> shipments = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        while (true) {
            System.out.print("Enter Shipment ID (or 'done' to finish): ");
            String shipmentId = scanner.nextLine();

            if (shipmentId.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Enter Destination: ");
            String destination = scanner.nextLine();

            System.out.print("Enter Departure Date (dd/MM/yyyy): ");
            Date departureDate;
            try {
                departureDate = sdf.parse(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid date format. Try again.");
                continue;
            }

            System.out.print("Enter Weight (kg): ");
            double weight = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            shipments.add(new Shipment(shipmentId, destination, departureDate, weight));
        }

        if (shipments.isEmpty()) {
            System.out.println("No shipments to sort.");
            return;
        }

        System.out.println("\nSelect Sorting Method:");
        System.out.println("1: Sort by Departure Date");
        System.out.println("2: Sort by Weight");
        System.out.println("3: Sort by Destination");
        System.out.print("Enter choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Collections.sort(shipments, new SortByDate());
                break;
            case 2:
                Collections.sort(shipments, new SortByWeight());
                break;
            case 3:
                Collections.sort(shipments, new SortByDestination());
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println("\nSorted Shipments:");
        for (Shipment s : shipments) {
            System.out.println(s);
        }

        scanner.close();
    }
}
