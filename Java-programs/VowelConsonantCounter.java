//2. How do you count a number of vowels and consonants in a given string?

import java.util.Scanner;

public class VowelConsonantCounter {
    public static void countVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;

        // Convert the input string to lowercase for case-insensitive comparison
        str = str.toLowerCase();

        // Iterate through each character of the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
            // Check if the character is an alphabet (excluding vowels)
            else if ((ch >= 'a' && ch <= 'z')) {
                consonantCount++;
            }
        }

        // Print the counts of vowels and consonants
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Close the scanner after reading input
        scanner.close();

        // Call the method to count vowels and consonants
        countVowelsAndConsonants(input);
    }
}


/*
Output
1)
Enter a string: Roshan
Number of vowels: 2
Number of consonants: 4

2)
Enter a string: Hello
Number of vowels: 2
Number of consonants: 3

*/