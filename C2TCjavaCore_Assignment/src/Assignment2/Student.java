package Assignment2;
import java.util.Scanner;
public class Student {
	private String name;
    private int rollNo;
    private double marks;

    // Shared Scanner object for the whole class/package usage
    private static final Scanner sc = new Scanner(System.in);

    // Default constructor (reads from keyboard)
    public Student() {
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();

        System.out.print("Enter Marks: ");
        marks = sc.nextDouble();
        sc.nextLine(); // consume leftover newline
    }

    public void displayStudent() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name   : " + name);
        System.out.println("RollNo : " + rollNo);
        System.out.println("Marks  : " + marks);
    }
}
