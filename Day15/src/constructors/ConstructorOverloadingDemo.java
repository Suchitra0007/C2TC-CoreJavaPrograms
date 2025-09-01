package constructors;

class Product {
    int id;
    String name;
    double price;

    // Default constructor
    Product() {
        id = 0;
        name = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    Product(int i, String n, double p) {
        id = i;
        name = n;
        price = p;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Price: " + price);
    }
}

public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        Product p1 = new Product(); // default
        Product p2 = new Product(101, "Laptop", 55000);

        p1.display();
        p2.display();
    }
}
