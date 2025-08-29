package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorRemoveDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a"); list.add("b"); list.add("c");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            String s = itr.next();
            if ("b".equals(s)) itr.remove();   // safe removal using iterator
        }
        System.out.println("After iterator remove: " + list);
    }
}
