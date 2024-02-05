import java.util.Scanner;

public class Que5 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the last line number for the pattern
        System.out.print("Please Enter Last Line: ");
        
        // Read the user input for the last line number
        int num = input.nextInt();

        /*
        n = 5
         1
         0 0
         1 1 1
         0 0 0 0 
         1 1 1 1 1
         */

        // Loop through each line of the pattern
        for (int i = 1; i <= num; i++) {
            // Loop to print repeating 1s or 0s based on the current line number
            for (int j = 1; j <= i; j++) {
                // Print 1 if i is odd, and 0 if i is even
                System.out.print(" " + i % 2);
            }
            // Move to the next line after printing each line of the pattern
            System.out.println();
         }
    }
}
