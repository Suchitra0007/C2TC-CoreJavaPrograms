package polymorphism;

class Employee {
    String name;
    double basic;
    Employee(String name, double basic) { this.name = name; this.basic = basic; }
    double calculateSalary() { return basic; }
}
class Manager extends Employee {
    Manager(String name, double basic) { super(name, basic); }
    @Override
    double calculateSalary() { return basic + basic * 0.5; } // 50% allowance
}
public class PayrollDemo {
    public static void main(String[] args) {
        Employee[] emps = { new Employee("Ram", 30000), new Manager("Sita", 50000) };
        for (Employee e : emps) {
            System.out.println(e.name + " salary: " + e.calculateSalary());
        }
    }
}
