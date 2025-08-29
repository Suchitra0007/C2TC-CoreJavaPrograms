package abstraction;

public class AbstractDemo {
    public static void main(String[] args) {
        Shape circle = new Circle("Red", 5.0);
        Shape rectangle = new Rectangle("Blue", 4.0, 6.0);

        circle.displayColor();
        System.out.println("Circle area: " + circle.area());

        System.out.println("-----");

        rectangle.displayColor();
        System.out.println("Rectangle area: " + rectangle.area());
    }
}
