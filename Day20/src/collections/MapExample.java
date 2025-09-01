package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        // HashMap (no order)
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(3, "Mango");
        hashMap.put(2, "Orange"); // overrides key 2
        System.out.println("HashMap: " + hashMap);

        // LinkedHashMap (insertion order)
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(hashMap);
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // TreeMap (sorted by key)
        Map<Integer, String> treeMap = new TreeMap<>(hashMap);
        System.out.println("TreeMap: " + treeMap);
    }
}
