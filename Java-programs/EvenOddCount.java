//4. Write a Java program to find the number of even and odd integers in a given array of integers.

import java.util.Scanner;

public class EvenOddCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Read the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Find the number of even and odd integers
        int evenCount = 0;
        int oddCount = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Print the counts
        System.out.println("Number of even integers: " + evenCount);
        System.out.println("Number of odd integers: " + oddCount);

        scanner.close();
    }
}


/* 
Output
1)
Enter the size of the array: 5
Enter the elements of the array:
56
23
45
12
87
Number of even integers: 2
Number of odd integers: 3

2)
Enter the size of the array: 5
Enter the elements of the array:
85
25
14
36
87
Number of even integers: 2
Number of odd integers: 3
*/
