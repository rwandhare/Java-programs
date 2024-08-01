/*1.Create a Java program that acts as a simple calculator.

● The program should prompt the user to enter two numbers and an operator (+, -,

*, /).

● Perform the corresponding calculation based on the operator.

● Handle potential exceptions, such as division by zero or invalid operator input.

● Display the result or an appropriate error message.*/

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0;
        boolean validOperator = true;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                try {
                    if (num2 == 0) {
                        validOperator = false;
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        result = num1 / num2;
                    }
                } catch (ArithmeticException e) {
                    validOperator = false;
                    System.out.println("Arithmetic Exception: " + e.getMessage());
                }
                break;
            default:
                validOperator = false;
                System.out.println("Error: Invalid operator input.");
        }

        if (validOperator) {
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}

/*
OUTPUT
1)
Enter the first number: 50
Enter the second number: 85
Enter the operator (+, -, *, /): +
Result: 135.0

2)
Enter the first number: 65
Enter the second number: 22
Enter the operator (+, -, *, /): -
Result: 43.0
*/

