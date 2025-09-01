package polymorphism;

abstract class Shape {
    abstract double area();
}
class Circle extends Shape {
    private double r;
    Circle(double r) { this.r = r; }
    @Override
    double area() { return Math.PI * r * r; }
}
class Rectangle extends Shape {
    private double l, w;
    Rectangle(double l, double w) { this.l = l; this.w = w; }
    @Override
    double area() { return l * w; }
}
public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(2.0), new Rectangle(3.0, 4.0) };
        for (Shape s : shapes) {
            System.out.println("Area: " + s.area());
        }
    }
}
