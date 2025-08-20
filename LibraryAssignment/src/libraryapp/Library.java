package libraryapp;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void showAllItems() {
        System.out.println("Library contains:");
        for (Item item : items) {
            System.out.println("- " + item.label());
        }
    }
}
