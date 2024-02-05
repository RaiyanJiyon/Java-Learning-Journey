import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        // Display a message indicating the purpose of the program
        System.out.println("Sum Of Digits Program: ");

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter some digits
        System.out.print("Enter Some Digits: ");
        int digit = input.nextInt();

        // Variables to store temporary values during the calculation
        int sum = 0;
        int reminder, temp;

        // Store the original number in a temporary variable
        temp = digit;

        // Calculate the sum of the digits
        while (temp != 0) {
            reminder = temp % 10;
            sum = sum + reminder;
            temp = temp / 10;
        }

        // Display the sum of the digits
        System.out.println("Sum Of Digits - " + sum);
    }
}
