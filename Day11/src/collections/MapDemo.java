package collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Alice");
        map.put(102, "Bob");
        map.put(103, "Charlie");

        System.out.println("Map: " + map);
        System.out.println("Get key 102 -> " + map.get(102));

        System.out.println("Iterate entries:");
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println("  " + e.getKey() + " -> " + e.getValue());
        }
    }
}
