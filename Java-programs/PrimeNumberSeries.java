//Write a program to print prime number  series.

import java.util.Scanner;

public class PrimeNumberSeries {

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();

        System.out.println("Prime numbers up to " + limit + ":");

        // Print all prime numbers up to the specified limit
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}