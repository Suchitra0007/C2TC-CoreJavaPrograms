package polymorphism;

public class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike starts with a self-start button.");
    }

    @Override
    public void stop() {
        System.out.println("Bike stops with disc brakes.");
    }
}
