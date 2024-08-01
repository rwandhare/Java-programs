//3. Write a Java program to find common elements between two arrays (string values).

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the first array
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] array1 = new String[size1];

        // Read the elements of the first array
        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextLine();
        }

        // Read the size of the second array
        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] array2 = new String[size2];

        // Read the elements of the second array
        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextLine();
        }

        // Find common elements
        Set<String> commonElements = findCommonElements(array1, array2);

        // Print common elements
        System.out.println("Common elements: ");
        for (String element : commonElements) {
            System.out.println(element);
        }

        scanner.close();
    }

    // Function to find common elements between two arrays
    public static Set<String> findCommonElements(String[] array1, String[] array2) {
        Set<String> set1 = new HashSet<>();
        Set<String> commonElements = new HashSet<>();

        // Add elements of the first array to a set
        for (String element : array1) {
            set1.add(element);
        }

        // Check elements of the second array against the set
        for (String element : array2) {
            if (set1.contains(element)) {
                commonElements.add(element);
            }
        }

        return commonElements;
    }
}




/*
Output
1)
Enter the size of the first array: 5
Enter the elements of the first array:
96
36
25
41
87
Enter the size of the second array: 5
Enter the elements of the second array:
89
96
32
41
58
Common elements:
96
41

2)
Enter the size of the first array: 4
Enter the elements of the first array:
89
32
45
65
Enter the size of the second array: 4
Enter the elements of the second array:
89
32
54
55
Common elements:
89
32
*/

