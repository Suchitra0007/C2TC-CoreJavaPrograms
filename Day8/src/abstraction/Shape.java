package abstraction;

public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    // abstract method (must be implemented by subclasses)
    public abstract double area();

    public void displayColor() {
        System.out.println("Shape color: " + color);
    }
}
