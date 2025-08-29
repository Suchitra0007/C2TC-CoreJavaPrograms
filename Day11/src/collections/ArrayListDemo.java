package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("banana"); // duplicate allowed
        System.out.println("List: " + list);
        System.out.println("Size: " + list.size());
        System.out.println("Contains banana? " + list.contains("banana"));
        list.remove("orange");
        System.out.println("After remove: " + list);

        System.out.println("Iterating with for-each:");
        for (String s : list) System.out.println("  " + s);

        Collections.sort(list);
        System.out.println("Sorted: " + list);
    }
}
