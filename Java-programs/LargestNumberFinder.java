//4. WAP to display the largest no among three nos.

import java.util.Scanner;

public class LargestNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Find the largest number among the three
        int largest;
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        // Print the largest number
        System.out.println("The largest number among " + num1 + ", " + num2 + ", and " + num3 + " is " + largest);

        scanner.close();
    }
}


/* Output

Enter the first number: 10
Enter the second number: 25
Enter the third number: 15
The largest number among 10, 25, and 15 is 25

*/
