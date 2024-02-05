import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter any valid number
        System.out.print("Enter Any Valid Number: ");
        int number = input.nextInt();

        // Check the conditions using if-else statements
        if (number == 0 || (number % 2 == 0)) {
            System.out.println("Even Number.");
        } else if (number > 0 && number % 2 != 0) {
            System.out.println("Odd Number.");
        } else {
            System.out.println("Invalid Number.");
        }
    }
}
