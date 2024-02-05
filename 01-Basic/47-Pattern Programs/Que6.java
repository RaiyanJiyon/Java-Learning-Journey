package PatternPrograms;

import java.util.Scanner;

public class Que6 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the last line number for the pattern
        System.out.print("Please Enter Last Line: ");
        
        // Read the user input for the last line number
        int num = input.nextInt();

        /*
         A
         A B
         A B C
         A B C D
         A B C D E
         */

        // Loop through each line of the pattern
        for (int i = 1; i <= num; i++) {
            // Loop to print letters 'A' to the current line number
            for (int j = 1; j <= i; j++) {
                // Convert ASCII value to char and print
                System.out.print(" " + (char) (j + 64));
            }
            // Move to the next line after printing each line of the pattern
            System.out.println();
        }
    }
}
