package libraryapp;

public class Book extends Item {
    private String author;

    public Book(int id, String title, String author) {
        super(id, title);
        this.author = author;
    }

    @Override
    public String displayInfo() {
        return "Book: [ID: " + getId() +
               ", Title: " + getTitle() +
               ", Author: " + author + "]";
    }

    @Override
    public String label() {
        return getTitle() + " by " + author;
    }
}
