import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Display a message indicating the purpose of the program
        System.out.println("Reverse Digits Program: ");

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter some digits
        System.out.print("Enter Some Digits- ");
        int digit = input.nextInt();

        // Variables to store temporary values during the calculation
        int sum = 0;
        int reminder, temp;
        temp = digit;

        // Reverse the digits of the number
        while (temp != 0) {
            reminder = temp % 10;
            sum = sum * 10 + reminder;
            temp = temp / 10;
        }

        // Display the reversed number
        System.out.println("Reverse Number Of " + digit + " Is - " + sum);
    }
}
