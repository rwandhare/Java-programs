import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueReversing = true;

        while (continueReversing) {
            System.out.print("Enter a string to reverse: ");
            String input = scanner.nextLine();

            // Input validation
            if (input.isEmpty()) {
                System.out.println("Input string cannot be empty. Please try again.");
                continue;
            }

            // Reverse the string
            String reversedString = reverseString(input);
            System.out.println("Reversed string: " + reversedString);

            // Ask the user if they want to reverse another string
            System.out.print("Do you want to reverse another string? (yes/y or no/n): ");
            String response = scanner.nextLine().trim().toLowerCase();

            if (!response.equals("yes") && !response.equals("y")) {
                continueReversing = false;
                System.out.println("Exiting the program. Goodbye!");
            }
        }

        scanner.close();
    }

    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Swap the characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move the pointers towards the center
            left++;
            right--;
        }

        return new String(charArray);
    }
}



/*
Enter a string to reverse: Roshan
Reversed string: nahsoR
Do you want to reverse another string? (yes/y or no/n): y
Enter a string to reverse: How are you.
Reversed string: .uoy era woH
Do you want to reverse another string? (yes/y or no/n): n
Exiting the program. Goodbye!
*/