package inheritance;

public class DerivedClass extends BaseClass {
    private String type = "Derived Class";

    public void show() {
        System.out.println("This is the " + type);
    }
}
