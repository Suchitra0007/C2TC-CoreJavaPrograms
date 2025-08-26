package com.tnsif.staticdemo;

public class Student {
    private int id;
    private String name;

    // shared by all Student objects
    private static String collegeName;

    // static block runs once when the class loads
    static {
        collegeName = "TNSIF College";
        System.out.println("Static block: collegeName initialized");
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // static method can change shared state
    public static void changeCollege(String newName) {
        collegeName = newName;
    }

    public static String getCollegeName() {
        return collegeName;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', college='" + collegeName + "'}";
    }
}
