package polymorphism;

class Animal2 {
    void sound() { System.out.println("Animal2 sound"); }
}
class Dog2 extends Animal2 {
    @Override
    void sound() { System.out.println("Dog2 barks"); }
    void fetch() { System.out.println("Dog2 fetching"); }
}
public class CastingDemo {
    public static void main(String[] args) {
        Animal2 a = new Dog2();       // upcast
        a.sound();                    // Dog2 method (runtime)
        if (a instanceof Dog2) {
            Dog2 d = (Dog2) a;        // safe downcast
            d.fetch();
        }
    }
}
