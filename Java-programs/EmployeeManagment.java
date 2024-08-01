/*4. Write a Java program that creates a class hierarchy for employees of a company. The base class should be Employee, with subclasses Manager, Developer, and Programmer. Each subclass should have properties such as name, address, salary, and job title. Implement methods for calculating bonuses, generating performance reports, and managing projects.*/


abstract class Employee {
    private String name;
    private String address;
    private double salary;
    private String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public abstract double calculateBonus(); // Method to calculate bonuses
    public abstract String generatePerformanceReport(); // Method to generate performance reports
    public abstract void manageProject(String project); // Method to manage projects
}

class Manager extends Employee {
    public Manager(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.20; // 20% of salary as bonus
    }

    @Override
    public String generatePerformanceReport() {
        return "Manager Performance Report for " + getName();
    }

    @Override
    public void manageProject(String project) {
        System.out.println("Manager " + getName() + " is managing project: " + project);
    }
}

class Developer extends Employee {
    public Developer(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.15; // 15% of salary as bonus
    }

    @Override
    public String generatePerformanceReport() {
        return "Developer Performance Report for " + getName();
    }

    @Override
    public void manageProject(String project) {
        System.out.println("Developer " + getName() + " is developing project: " + project);
    }
}
class Programmer extends Employee {
    public Programmer(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.10; // 10% of salary as bonus
    }

    @Override
    public String generatePerformanceReport() {
        return "Programmer Performance Report for " + getName();
    }

    @Override
    public void manageProject(String project) {
        System.out.println("Programmer " + getName() + " is programming project: " + project);
    }
}
public class EmployeeManagment {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice Johnson", "123 Main St", 120000, "Manager");
        Employee developer = new Developer("Bob Smith", "456 Elm St", 100000, "Developer");
        Employee programmer = new Programmer("Charlie Brown", "789 Oak St", 80000, "Programmer");

        System.out.println(manager.getJobTitle() + " " + manager.getName() + " - Bonus: $" + manager.calculateBonus());
        System.out.println(manager.generatePerformanceReport());
        manager.manageProject("Project Alpha");

        System.out.println(developer.getJobTitle() + " " + developer.getName() + " - Bonus: $" + developer.calculateBonus());
        System.out.println(developer.generatePerformanceReport());
        developer.manageProject("Project Beta");

        System.out.println(programmer.getJobTitle() + " " + programmer.getName() + " - Bonus: $" + programmer.calculateBonus());
        System.out.println(programmer.generatePerformanceReport());
        programmer.manageProject("Project Gamma");
    }
}


/*	OUTPUT

Manager Alice Johnson - Bonus: $24000.0
Manager Performance Report for Alice Johnson
Manager Alice Johnson is managing project: Project Alpha
Developer Bob Smith - Bonus: $15000.0
Developer Performance Report for Bob Smith
Developer Bob Smith is developing project: Project Beta
Programmer Charlie Brown - Bonus: $8000.0
Programmer Performance Report for Charlie Brown
Programmer Charlie Brown is programming project: Project Gamma
*/

