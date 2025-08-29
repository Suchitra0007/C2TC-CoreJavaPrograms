package encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student s = new Student();

        // set values using setters
        s.setId(101);
        s.setName("Suchitra");

        // get values using getters
        System.out.println("Student ID: " + s.getId());
        System.out.println("Student Name: " + s.getName());
    }
}
