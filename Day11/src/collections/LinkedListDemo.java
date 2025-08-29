package collections;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("One");
        list.addFirst("Zero");
        list.addLast("Two");
        System.out.println("LinkedList: " + list);

        // iterate
        for (String s : list) System.out.println(s);
    }
}
