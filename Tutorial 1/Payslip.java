import java.util.Scanner;

public class Payslip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter hours worked: ");
        double hours = input.nextDouble();

        System.out.print("Enter hourly pay rate: ");
        double rate = input.nextDouble();

        double grossPay = hours * rate;
        double tax = grossPay * 0.35;
        double netPay = grossPay - tax;

        System.out.printf("Net Pay: %.2f%n", netPay);
    }
}
