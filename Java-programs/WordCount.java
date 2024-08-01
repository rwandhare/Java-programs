//4. Write a Java Program to count the number of words in a String without using the Predefined method?

import java.util.Scanner;

public class WordCount {
    public static int countWords(String str) {
        int wordCount = 0;
        boolean prevSpace = true;

        for (char ch : str.toCharArray()) {
            if (ch != ' ' && prevSpace) {
                wordCount++;
            }
            prevSpace = (ch == ' ');
        }

        return wordCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Close the scanner after reading input
        scanner.close();

        // Call the method to count words and print the result
        int result = countWords(input);
        System.out.println("Number of words in the string: " + result);
    }
}

/*
Output
1)
Enter a string: Hello Roshan
Number of words in the string: 2

2)
Enter a string: Good morning to everyone.
Number of words in the string: 4
*/