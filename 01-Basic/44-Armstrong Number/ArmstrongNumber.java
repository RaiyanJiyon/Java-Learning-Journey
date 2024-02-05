import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Display a message indicating the purpose of the program
        System.out.println("Armstrong Program: ");

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter some digits
        System.out.print("Enter Some Digits- ");

        // Read the user input for the digits
        int digit = input.nextInt();

        // Variables to store temporary values during the calculation
        int temp = digit;
        int reverse = 0;
        int remainder;

        // Calculate the sum of cubes of individual digits
        while (temp != 0) {
            remainder = temp % 10;
            reverse = reverse + remainder * remainder * remainder;
            temp = temp / 10;
        }

        // Check if the original number is equal to the calculated sum
        if (digit == reverse) {
            // Display the result if the number is an Armstrong number
            System.out.println(digit + " is an Armstrong Number.");
        } else {
            // Display the result if the number is not an Armstrong number
            System.out.println(digit + " is not an Armstrong Number.");
        }
    }
}
