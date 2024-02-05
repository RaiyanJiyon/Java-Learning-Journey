// find factorial of n

import java.util.Scanner;

public class Assignment11 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter any integer number
        System.out.print("Enter Any Integer Number: ");
        int num = input.nextInt();

        // Initialize a variable to store the factorial
        int fact = 1;

        // Loop to calculate the factorial of the given number
        for (int i = num; i >= 1; i--) {
            fact = fact * i;
        }

        // Display the factorial of the given number
        System.out.println("Factorial Of " + num + " - " + fact);
    }
}
