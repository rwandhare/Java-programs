//Write a program to check string is palindrom or not


import java.util.Scanner;
public class PalindromeChecker {

    public static boolean isPalindrome(String s) {
        
        s = s.replaceAll("\\s+", "").toLowerCase();
        
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        String stringToCheck = scanner.nextLine();
        scanner.close();

        if (isPalindrome(stringToCheck)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
/* output
Enter a string to check if it's a palindrome: 151
The string is a palindrome.

*/

