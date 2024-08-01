//2. Write a Java program that throws an exception and catch it using a try-catch block.


import java.util.Scanner;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        // Create a Scanner object for taking input from the user
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter the first integer
            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();

            // Prompt the user to enter the second integer
            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();

            // Attempt to divide the first integer by the second integer
            // This line may throw an ArithmeticException if num2 is zero
            int result = num1 / num2;

            // If the division is successful, print the result
            System.out.println("The result of the division is: " + result);
        } catch (ArithmeticException e) {
            // This block will execute if an ArithmeticException is thrown
            // Print an error message
            System.out.println("Caught exception: Division by zero is not allowed.");
            e.printStackTrace();
        } finally {
            // Close the scanner to prevent resource leaks
            scanner.close();
        }

        // This line will execute whether an exception was thrown or not
        System.out.println("Program continues after the catch block.");
    }
}

/*
Output


*/
