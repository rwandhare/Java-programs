//1. How to print duplicate characters from the String?

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharacters {
    public static void printDuplicateCharacters(String str) {
        Set<Character> uniqueChars = new HashSet<>();
        Set<Character> duplicateChars = new HashSet<>();

        char[] charArray = str.toCharArray();

        // Iterate through the characters in the input string
        for (char ch : charArray) {
            // If the character is already in uniqueChars set, it's a duplicate
            if (!uniqueChars.add(ch)) {
                duplicateChars.add(ch);
            }
        }

        System.out.println("Input string: " + str);

        // Print explanations based on whether duplicate characters were found or not
        if (duplicateChars.isEmpty()) {
            System.out.println("Explanation: No duplicate characters found in the input string.");
        } else {
            System.out.println("Explanation: Duplicate characters found in the input string.");
            System.out.println("Duplicate characters:");
            for (char ch : duplicateChars) {
                System.out.println(ch);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Close the scanner after reading input
        scanner.close();

        // Call the method to print duplicate characters with explanations
        printDuplicateCharacters(input);
    }
}


/*
Output

1)
Input string: Hello World
Explanation: Duplicate characters found in the input string.
Duplicate characters:
l
o

2)
Enter a string: How are you
Input string: How are you
Explanation: Duplicate characters found in the input string.
Duplicate characters:

o

*/