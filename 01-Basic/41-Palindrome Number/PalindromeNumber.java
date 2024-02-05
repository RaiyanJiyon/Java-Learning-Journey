import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        // Display a message indicating the purpose of the program
        System.out.println("Palindrome Number Program -");

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter any digit
        System.out.print("Enter Any Digit: ");
        int digit = input.nextInt();

        // Variables to store temporary values during the calculation
        int temp = digit;
        int reversed = 0;
        int reminder;

        // Reverse the number
        while (temp != 0) {
            reminder = temp % 10;
            reversed = reversed * 10 + reminder;
            temp = temp / 10;
        }

        // Display the reversed number
        System.out.println("Reverse Number - " + reversed);

        // Check if the original number is equal to the reversed number
        if (digit == reversed) {
            // Display the result if the number is a palindrome
            System.out.println(digit + " is a Palindrome Number.");
        } else {
            // Display the result if the number is not a palindrome
            System.out.println(digit + " is not a Palindrome Number.");
        }
    }
}
