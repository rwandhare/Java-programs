//Write a java program to check string is Anagram.

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

    public static boolean isAnagram(String str1, String str2) {
        char[] charArray1 = str1.replaceAll("\\s+", "").toLowerCase().toCharArray();
        char[] charArray2 = str2.replaceAll("\\s+", "").toLowerCase().toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();
        scanner.close();

        System.out.println(isAnagram(string1, string2) ? "The strings are anagrams." : "The strings are not anagrams.");
    }
}

/*Output
Enter the first string: listen
Enter the second string: silent
The strings are anagrams.
*/