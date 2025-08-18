package com.suchitra.assignment.utilities;

import com.suchitra.assignment.employees.Employee;

/**
 * EmployeeUtilities provides utility methods for Employee objects.
 * Demonstrates use of public and protected access modifiers.
 */
public class EmployeeUtilities {

    /**
     * Increase an employee's salary by a percentage.
     * @param employee employee object
     * @param percentage percentage increment
     */
    public static void increaseSalary(Employee employee, double percentage) {
        double newSalary = employee.getSalary() + (employee.getSalary() * percentage / 100);
        employee.setSalary(newSalary);
        System.out.println("Salary updated for " + employee.getName() + ": " + newSalary);
    }

    /**
     * Print employee details using displayInfo().
     * @param employee employee object
     */
    public static void printEmployeeDetails(Employee employee) {
        employee.displayInfo();
    }
}
