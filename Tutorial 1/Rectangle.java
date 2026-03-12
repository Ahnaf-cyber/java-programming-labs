import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = input.nextDouble();

        System.out.print("Enter width: ");
        double width = input.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);
        double diagonal = Math.sqrt(length * length + width * width);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.printf("Diagonal: %.2f%n", diagonal);

    }
}
