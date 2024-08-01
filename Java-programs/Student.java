/*  3. Write a Java program to create a class called Student with private instance variables student_id, student_name, and grades. Provide public getter and setter methods to access and modify the student_id and student_name variables. However, provide a method called addGrade() that allows adding a grade to the grades variable while performing additional validation. */



import java.util.ArrayList;

public class Student {
    // Private instance variables
    private int student_id;
    private String student_name;
    private ArrayList<Integer> grades;

    // Constructor
    public Student(int student_id, String student_name) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.grades = new ArrayList<>();
    }

    // Getter for student_id
    public int getStudent_id() {
        return student_id;
    }

    // Setter for student_id
    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    // Getter for student_name
    public String getStudent_name() {
        return student_name;
    }

    // Setter for student_name
    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    // Method to add grade with validation
    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
            System.out.println("Grade added successfully.");
        } else {
            System.out.println("Invalid grade. Grade must be between 0 and 100.");
        }
    }

    // Main method to test the Student class
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student(1, "John Doe");

        // Display initial student details
        System.out.println("Student ID: " + student.getStudent_id());
        System.out.println("Student Name: " + student.getStudent_name());

        // Add grades
        student.addGrade(85);
        student.addGrade(92);
        student.addGrade(78);

        // Display grades
        System.out.println("\nGrades:");
        for (int grade : student.grades) {
            System.out.println(grade);
        }

        // Modify student details using setter methods
        student.setStudent_id(2);
        student.setStudent_name("Jane Doe");

        // Display modified student details
        System.out.println("\nModified Student Details:");
        System.out.println("Student ID: " + student.getStudent_id());
        System.out.println("Student Name: " + student.getStudent_name());
    }
}

/*
 Output
Student ID: 1
Student Name: John Doe
Grade added successfully.
Grade added successfully.
Grade added successfully.

Grades:
85
92
78
*/

