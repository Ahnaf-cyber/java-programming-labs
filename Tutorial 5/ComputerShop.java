import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ComputerShop {

    private ArrayList<Part> parts;

    public ComputerShop() {
        parts = new ArrayList<>();
    }

    public void loadPartsData(String filename) throws IOException {
        parts.clear();

        File file = new File(filename);
        Scanner sc = new Scanner(file);

        int numberOfParts = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < numberOfParts; i++) {
            String name = sc.nextLine();
            String description = sc.nextLine();
            double price = Double.parseDouble(sc.nextLine());

            Part p = new Part(name, description, price);
            p.setQuantity(5); 

            parts.add(p);
        }

        sc.close();
    }

   
    public void showParts() {
        for (Part p : parts) {
            System.out.println(p);
        }
    }

    
    public void reportParts() throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter("parts-report.txt"));

        for (Part p : parts) {
            writer.println(p);
        }

        writer.close();
        System.out.println("Report saved to parts-report.txt");
    }

    
    public void addPart(Part p) {
        if (p != null) {
            parts.add(p);
        }
    }
}
