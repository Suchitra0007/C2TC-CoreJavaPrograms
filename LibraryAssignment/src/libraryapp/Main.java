package libraryapp;

public class Main {
    public static void main(String[] args) {
        // Part A: Inheritance
        Book book = new Book(101, "Java Basics", "James Gosling");
        Magazine mag = new Magazine(201, "Tech Today", 45);

        System.out.println(book.displayInfo());
        System.out.println(mag.displayInfo());

        // Part B: Composition
        Library lib = new Library();
        lib.addItem(book);
        lib.addItem(mag);
        lib.showAllItems();
    }
}
