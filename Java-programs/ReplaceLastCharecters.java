/* 3. Write a method that takes a String and returns a String of the same length containing the 'X' character in all positions except the last 4 positions. The characters in the last 4 positions must be the same as in the original string. For example, if the argument is

"12345678", the return value should be "XXXX5678".*/

import java.util.Scanner;

public class ReplaceLastCharacters {
    public static String replaceLastCharacters(String str) {
        // Check if the input string has at least 4 characters
        if (str.length() < 4) {
            throw new IllegalArgumentException("Input string must have at least 4 characters.");
        }

        // Get the last 4 characters of the original string
        String lastFourChars = str.substring(str.length() - 4);

        // Create a new string with 'X' characters until the last 4 positions
        String newXString = "X".repeat(str.length() - 4);

        // Append the last 4 characters of the original string to the new string
        return newXString + lastFourChars;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Close the scanner after reading input
        scanner.close();

        // Call the method to replace last characters and print the result
        String result = replaceLastCharacters(input);
        System.out.println("Original String: " + input);
        System.out.println("Modified String: " + result);
    }
}


/*
Output
1)
Enter a string: 8546971232
Original String: 8546971232
Modified String: XXXXXX1232

2)
Enter a string: 87542567945
Original String: 87542567945
Modified String: XXXXXXX7945
*/