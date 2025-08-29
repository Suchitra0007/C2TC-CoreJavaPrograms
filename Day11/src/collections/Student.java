package collections;

public class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return id + ":" + name;
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name); // default: sort by name
    }
}
