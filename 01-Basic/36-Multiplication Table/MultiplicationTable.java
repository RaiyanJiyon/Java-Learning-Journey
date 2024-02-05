import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter First Number: ");
        int firstNum = input.nextInt();

        // Prompt the user to enter the last number
        System.out.print("Enter Last Number: ");
        int lastNum = input.nextInt();

        // Nested loop to generate the multiplication table for the given range
        for (int i = firstNum; i <= lastNum; i++) {

            for (int j = 1; j <= 10; j++) {
                // Display the multiplication table entry for each combination of i and j
                System.out.println(i + " X " + j + " = " + i * j);
            }

            // Add newlines to separate tables for different numbers
            System.out.println("\n\n");
        }
    }
}
