//Write a java program to check given number is perfect number or not.

import java.util.Scanner;

public class PerfectNumber {

    // Function to check if a number is a perfect number
    public static boolean isPerfect(int number) {
        // Perfect number must be greater than 1
        if (number < 2) {
            return false;
        }
        
        int sum = 1;  // 1 is a proper divisor of any number

        // Find all proper divisors and sum them up
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check if the sum of divisors is equal to the number
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a perfect number
        if (isPerfect(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }

        scanner.close();
    }
}