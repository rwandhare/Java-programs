//1. Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.


import java.util.Scanner;

class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

// Class with a method to check if a number is odd and throw an exception if it is
public class NumberChecker {

    // Method to check if a number is odd and throw an exception if true
    public void checkNumber(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("Number is odd: " + number);
        }
        System.out.println("Number is even: " + number);
    }

    // Main method to test the checkNumber method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberChecker checker = new NumberChecker();

        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();

        try {
            checker.checkNumber(number);
        } catch (OddNumberException e) {
            System.out.println("Caught exception: " + e.getMessage());
            // Handle the exception here
        }

        scanner.close();
    }
}


/*
Output
1)
Enter an integer:
6
Number is even: 6

2)
Enter an integer:
5
Caught exception: Number is odd: 5
*/