package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        // HashSet (no order, no duplicates)
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Mango");
        hashSet.add("Apple"); // ignored
        System.out.println("HashSet: " + hashSet);

        // LinkedHashSet (insertion order maintained)
        Set<String> linkedHashSet = new LinkedHashSet<>(hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // TreeSet (sorted order)
        Set<String> treeSet = new TreeSet<>(hashSet);
        System.out.println("TreeSet: " + treeSet);
    }
}
