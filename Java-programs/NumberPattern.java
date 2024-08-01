/*1. WAP to display the following pattern:

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/


public class NumberPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            // Loop to print numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}


/*Output

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

*/