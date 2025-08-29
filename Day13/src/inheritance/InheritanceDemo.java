package inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        DerivedClass obj = new DerivedClass();

        obj.display();  // from BaseClass
        obj.show();     // from DerivedClass
    }
}
