package methods;

public class MethodDemo {

    // Simple method
    public void greet() {
        System.out.println("Hello, welcome to Java methods!");
    }

    // Method with parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Method with return type
    public String getMessage() {
        return "Learning methods is easy!";
    }

    public static void main(String[] args) {
        MethodDemo demo = new MethodDemo();
        demo.greet();
        System.out.println("Sum = " + demo.add(10, 20));
        System.out.println(demo.getMessage());
    }
}
