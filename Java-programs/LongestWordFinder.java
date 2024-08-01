/*2. Write a program in Java to enter a String/Sentence and display the longest word and the length of the longest word present in the String.
Sample Input: “TATA FOOTBALL ACADEMY WILL PLAY AGAINST MOHAN BAGAN” Sample Output: The longest word: FOOTBALL: The length of the word: 8*/



import java.util.Scanner; // Import the Scanner class to read input from the user

public class LongestWordFinder { // Define the class LongestWordFinder
    public static void main(String[] args) { // Main method, the entry point of the program
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the console
        System.out.print("Enter a sentence: "); // Prompt the user to enter a sentence
        String input = scanner.nextLine(); // Read the input sentence using the Scanner object

        // Split the input sentence into words using spaces as the delimiter
        // The split() method returns an array of words
        String[] words = input.split("\\s+");

        String longestWord = ""; // Initialize the longest word as an empty string
        int maxLength = 0; // Initialize the maximum length as 0

        // Iterate through each word in the array
        for (String word : words) {
            // Check if the current word's length is greater than the maximum length found so far
            if (word.length() > maxLength) {
                maxLength = word.length(); // Update the maximum length
                longestWord = word; // Update the longest word
            }
        }

        // Print the longest word and its length
        System.out.println("The longest word: " + longestWord);
        System.out.println("The length of the word: " + maxLength);
    }
}


/*OUTPUT
1)
Enter a sentence: TATA FOOTBALL ACADEMY WILL PLAY AGAINST MOHAN BAGAN
The longest word: FOOTBALL
The length of the word: 8

2)
Enter a sentence: OPTIMSE PRIME IS IMMORTAL PERSON.
The longest word: IMMORTAL
The length of the word: 8
*/