package com.tnsif.staticdemo;

class Calculator {
    static { 
        System.out.println("Calculator static block executed"); 
    }

    // static method: call without object
    static int add(int a, int b) { 
        return a + b; 
    }

    // instance method: needs an object
    int multiply(int a, int b) { 
        return a * b; 
    }
}

public class StaticMethodDemo {
    public static void main(String[] args) {
        int sum = Calculator.add(5, 7);              // static call
        System.out.println("Sum: " + sum);

        Calculator calc = new Calculator();          // instance call
        System.out.println("Product: " + calc.multiply(3, 4));
    }
}
