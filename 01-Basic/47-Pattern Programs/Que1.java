import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the line number for the pattern
        System.out.print("Please Enter Line Number: ");
        
        // Read the user input for the line number
        int num = input.nextInt();

        /*
        n = 5
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
         */

        // Loop through each line of the pattern
        for (int row = 1; row <= num; row++) {
            // Loop to print numbers from 1 to the current row number
            for (int col = 1; col <= row; col++) {
                // Print the current column number
                System.out.print(" " + col);
            }
            // Move to the next line after printing each line of the pattern
            System.out.println();
        }
    }
}
