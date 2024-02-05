import java.util.Scanner;

// Create a pattern like the following one if n=4
/*
 1
 1 0
 1 0 1
 1 0 1 0
 */
public class Assignment17 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the last line number for the pattern
        System.out.print("Please Enter Last Line: ");
        
        // Read the user input for the last line number
        int num = input.nextInt();

        // Loop through each line of the pattern
        for (int i = 1; i <= num; i++) {
            // Loop to print numbers alternating between 1 and 0
            for (int j = 1; j <= i; j++) {
                // Print 1 if j is odd, and 0 if j is even
                System.out.print(" " + j % 2);
            }
            // Move to the next line after printing each line of the pattern
            System.out.println();
        }
    }
}
