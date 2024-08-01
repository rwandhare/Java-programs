//3. Write a Java program that reads a list of integers from the user and throws an exception if any numbers are duplicates.

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Custom Exception class for duplicate numbers
class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}

public class DuplicateChecker {
    
    // Method to read integers from the user and check for duplicates
    public void readAndCheckNumbers() throws DuplicateNumberException {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();

        System.out.println("Enter the number of integers you want to input:");
        int count = scanner.nextInt();

        System.out.println("Enter " + count + " integers:");

        for (int i = 0; i < count; i++) {
            int number = scanner.nextInt();
            if (!numbers.add(number)) {
                throw new DuplicateNumberException("Duplicate number found: " + number);
            }
        }

        System.out.println("All numbers are unique.");
        scanner.close();
    }

    public static void main(String[] args) {
        DuplicateChecker checker = new DuplicateChecker();

        try {
            checker.readAndCheckNumbers();
        } catch (DuplicateNumberException e) {
            System.out.println("Caught exception: " + e.getMessage());
            // Handle the exception here
        }
        
        System.out.println("Program continues after the catch block.");
    }
}
/*
Output
1)
Enter a string: Hello Roshan. Hello Rohit
Input string: Hello Roshan. Hello Rohit
Explanation: Duplicate characters found in the input string.
Duplicate characters:

R
e
H
h
l
o

2)
Enter a string: My name is Roshan
Input string: My name is Roshan
Explanation: Duplicate characters found in the input string.
Duplicate characters:

a
s
n
*/