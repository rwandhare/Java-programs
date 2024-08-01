//3. Write a program to Find factorial of a number.

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();

        // Calculate the factorial
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Print the result
        System.out.println("The factorial of " + number + " is " + factorial);

        scanner.close();
    }
}


/*
Output
Enter a number to find its factorial: 5
The factorial of 5 is 120
*/