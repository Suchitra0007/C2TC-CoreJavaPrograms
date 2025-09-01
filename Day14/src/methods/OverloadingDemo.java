package methods;

public class OverloadingDemo {

    // Method overloading (same name, different parameters)
    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        OverloadingDemo obj = new OverloadingDemo();
        System.out.println("Multiply 2 ints: " + obj.multiply(5, 10));
        System.out.println("Multiply 2 doubles: " + obj.multiply(2.5, 4.0));
        System.out.println("Multiply 3 ints: " + obj.multiply(2, 3, 4));
    }
}
