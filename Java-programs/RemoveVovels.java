/* 1. Write a program in Java to accept a word/a String and display the new string after removing all the vowels present in it.

Sample Input: COMPUTER APPLICATIONS

Sample Output: CMPTR PPLCTNS  */

import java.util.Scanner; // Import the Scanner class to read input

public class RemoveVowels { // Define the class
    public static void main(String[] args) { // Main method
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.print("Enter a string: "); // Prompt the user to enter a string
        String input = scanner.nextLine(); // Read the input string

        String result = removeVowels(input); // Call the method to remove vowels

        System.out.println("String after removing vowels: " + result); // Print the result
    }

    public static String removeVowels(String str) { // Method to remove vowels
        return str.replaceAll("[AEIOUaeiou]", ""); // Replace all vowels with an empty string
    }
}

/* OUTPUT
1)
Enter a string: COMPUTER APPLICATION
String after removing vowels: CMPTR PPLCTN


2)
Enter a string: MY NAME IS ROSHAN
String after removing vowels: MY NM S RSHN

*/