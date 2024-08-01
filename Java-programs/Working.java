/*1. Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().*/



// Employee.java
class Employee {
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("Employee is working.");
    }

    public double getSalary() {
        return salary;
    }
}

// HRManager.java
class HRManager extends Employee {

    public HRManager(double salary) {
        super(salary);
    }

    @Override
    public void work() {
        System.out.println("HR Manager is working.");
    }

    public void addEmployee() {
        System.out.println("HR Manager is adding a new employee.");
    }
}

// Main.java
public class Working {
    public static void main(String[] args) {
        Employee employee = new Employee(50000);
        employee.work();
        System.out.println("Employee Salary: " + employee.getSalary());

        HRManager hrManager = new HRManager(70000);
        hrManager.work();
        hrManager.addEmployee();
        System.out.println("HR Manager Salary: " + hrManager.getSalary());
    }
}

/*
Employee is working.
Employee Salary: 50000.0
HR Manager is working.
HR Manager is adding a new employee.
HR Manager Salary: 70000.0
*/

