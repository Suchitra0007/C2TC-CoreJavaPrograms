package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(103, "Kaviya"));
        students.add(new Student(101, "Suchitra"));
        students.add(new Student(102, "Ramesh"));

        System.out.println("Original: " + students);

        // sort by id using Comparator
        students.sort(Comparator.comparingInt(Student::getId));
        System.out.println("Sorted by id: " + students);
    }
}

