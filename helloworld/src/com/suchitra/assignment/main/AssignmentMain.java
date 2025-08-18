package com.suchitra.assignment.main;

import com.suchitra.assignment.employees.*;
import com.suchitra.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {
    public static void main(String[] args) {
        Manager mgr = new Manager("Alice", 101, 70000, "HR");
        Developer dev = new Developer("Bob", 102, 60000, "Java");

        System.out.println("Before Salary Increase:");
        EmployeeUtilities.printEmployeeDetails(mgr);
        EmployeeUtilities.printEmployeeDetails(dev);

        System.out.println("\nAfter Salary Increase:");
        EmployeeUtilities.increaseSalary(mgr, 10);
        EmployeeUtilities.increaseSalary(dev, 15);

        EmployeeUtilities.printEmployeeDetails(mgr);
        EmployeeUtilities.printEmployeeDetails(dev);
    }
}
