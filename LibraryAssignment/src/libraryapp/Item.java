package libraryapp;

public abstract class Item {
    private int id;
    private String title;

    public Item(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }

    public abstract String displayInfo();

    public String label() {
        return title;
    }
}

