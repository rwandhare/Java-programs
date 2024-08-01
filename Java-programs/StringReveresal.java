//Write a program to reverse the string.

import java.util.Scanner;

public class StringReversal {

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String inputString = scanner.nextLine();
        scanner.close();

        String reversedString = reverseString(inputString);
        System.out.println("Reversed string: " + reversedString);
    }
}


/*
output
Enter a string to reverse: ROSHAN
Reversed string: NAHSOR
*/