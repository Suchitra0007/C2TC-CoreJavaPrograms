package polymorphism;

public class OverloadingDemo {
    public void add(int a, int b) {
        System.out.println("int add: " + (a + b));
    }
    public void add(double a, double b) {
        System.out.println("double add: " + (a + b));
    }
    public void add(int a, int b, int c) {
        System.out.println("3-int add: " + (a + b + c));
    }
    public static void main(String[] args) {
        OverloadingDemo o = new OverloadingDemo();
        o.add(2, 3);
        o.add(2.5, 3.5);
        o.add(1, 2, 3);
    }
}
