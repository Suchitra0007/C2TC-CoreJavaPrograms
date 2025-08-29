package collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("apple"); // duplicate ignored
        System.out.println("Set (duplicates removed): " + set);
        System.out.println("Contains banana? " + set.contains("banana"));

        System.out.println("Iterating set:");
        for (String s : set) System.out.println("  " + s);
    }
}
