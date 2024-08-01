//2. Write a Java program to Reverse an Array.
import java.util.Scanner;

public class ReverseArray {
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

        // Reverse the array
        reverseArray(array);

        // Print the reversed array
        System.out.println("Reversed array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }

    // Function to reverse the array
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            // Swap the elements
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}



/*
Output
1)
Enter the size of the array: 5
Enter the elements of the array:
23
56
89
87
45
Reversed array:
45 87 89 56 23

2)
Enter the size of the array: 6
Enter the elements of the array:
32
45
87
89
65
12
Reversed array:
12 65 89 87 45 32
*/