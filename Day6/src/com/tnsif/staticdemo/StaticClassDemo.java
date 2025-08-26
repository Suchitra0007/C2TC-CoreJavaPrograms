package com.tnsif.staticdemo;

public class StaticClassDemo {

    // static nested class: doesn't need outer class instance
    static class Config {
        static final String APP = "DaySixDemo";
        static int version = 1;

        static void print() {
            System.out.println(APP + " v" + version);
        }
    }

    public static void main(String[] args) {
        Config.print();     // call static method of nested class
        Config.version = 2; // modify static field
        Config.print();
    }
}
