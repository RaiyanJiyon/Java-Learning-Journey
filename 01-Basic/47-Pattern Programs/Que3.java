import java.util.Scanner;

public class Que3 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the last line number for the pattern
        System.out.print("Please Enter Last Line: ");
        
        // Read the user input for the last line number
        int num = input.nextInt();

        /*
         1
         2 2
         2 2 3
         2 2 3 4
         2 2 3 4 5
         */

        // Loop through each line of the pattern
        for (int i = 1; i <= num; i++) {
            // Loop to print the current line number 'i' repeatedly
            for (int j = 1; j <= i; j++) {
                // Print the current line number
                System.out.print(" " + i);
            }
            // Move to the next line after printing each line of the pattern
            System.out.println();
         }
    }
}
