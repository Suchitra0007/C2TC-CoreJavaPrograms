package com.tnsif.staticdemo;

public class StaticVariableDemo {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Asha");
        Student s2 = new Student(2, "Rahul");

        System.out.println(s1);
        System.out.println(s2);

        // change static variable via static method
        Student.changeCollege("Global Institute");

        System.out.println("After change:");
        System.out.println(s1);
        System.out.println(s2);
    }
}
