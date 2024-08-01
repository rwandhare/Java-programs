//2. Write a program to find the Total marks and grade of a students from the given students marks using switch case.


import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Get the marks for each subject
        int[] marks = new int[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Calculate the total marks
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        // Calculate the average marks
        double averageMarks = totalMarks / (double) numSubjects;

        // Determine the grade using a switch case
        char grade;
        int averageCategory = (int) averageMarks / 10; // Determine the range of average marks
        switch (averageCategory) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
                break;
        }

        // Print the results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}



/* Output
Enter the number of subjects: 3
Enter the marks for subject 1: 85
Enter the marks for subject 2: 78
Enter the marks for subject 3: 92
Total Marks: 255
Average Marks: 85.0
Grade: B
*/