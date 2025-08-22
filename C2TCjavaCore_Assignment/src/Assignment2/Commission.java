package Assignment2;
import java.util.Scanner;
public class Commission {
	private String name;
    private String address;
    private String phone;
    private double salesAmount;

    // Shared Scanner object (don’t close System.in)
    private static final Scanner sc = new Scanner(System.in);

    // Accept details from user
    public void acceptDetails() {
        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Address: ");
        address = sc.nextLine();

        System.out.print("Enter Phone: ");
        phone = sc.nextLine();

        System.out.print("Enter Sales Amount: ");
        salesAmount = sc.nextDouble();
        sc.nextLine(); // consume leftover newline
    }

    // Calculate and display commission
    public void calculateCommission() {
        double commission;
        if (salesAmount >= 100000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 50000) {
            commission = salesAmount * 0.05;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.03;
        } else {
            commission = 0;
        }

        System.out.println("\n--- Employee Commission Details ---");
        System.out.println("Employee Name : " + name);
        System.out.println("Address       : " + address);
        System.out.println("Phone         : " + phone);
        System.out.println("Sales Amount  : " + salesAmount);
        System.out.println("Commission    : " + commission);
    }
}
