import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
        // Declare a 2D array with 4 rows and 5 columns
        int[][] num = new int[4][5];
        int k = 0;

        /*
         Sample Output
         0  1  2  3  4
         5  6  7  8  9 
         10 11 12 13 14
         15 16 17 18 19
         */

        // Populate the array with sequential numbers
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                num[i][j] = k;
                k++;
            }
        }

        // Print the 2D array
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                // Add a space before each element for better formatting
                System.out.print(" " + num[i][j]);
            }
            System.out.println();  // Move to the next line after printing each row
        }
    }
}
