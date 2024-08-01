// 1. Write a Java program to Find the Second Largest Number in an Array.

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Ensure the array has at least two elements
        if (size < 2) {
            System.out.println("Array should have at least two elements");
            return;
        }

        int[] numbers = new int[size];

        // Read the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int firstLargest, secondLargest;

        // Initialize the first and second largest
        firstLargest = secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] != firstLargest) {
                secondLargest = numbers[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element");
        } else {
            System.out.println("The second largest number is: " + secondLargest);
        }

        scanner.close();
    }
}


/*
Output
1)
Enter the elements of the array:
65
32
98
87
45
The second largest number is: 87

2)
Enter the size of the array: 6
Enter the elements of the array:
97
64
31
9643
85
47
The second largest number is: 97

*/