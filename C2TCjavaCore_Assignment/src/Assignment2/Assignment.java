package Assignment2;

public class Assignment {
	public static void main(String[] args) {
        // Create Student object -> constructor will ask for input
        Student s1 = new Student();
        s1.displayStudent();

        // Create Commission object -> will ask for input
        Commission emp = new Commission();
        emp.acceptDetails();
        emp.calculateCommission();

        System.out.println("\nProgram finished successfully!");
    }
}
