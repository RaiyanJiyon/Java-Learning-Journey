import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter any number
        System.out.print("Enter Any Number: ");
        int number = input.nextInt();

        // Check the condition using if-else statement
        if (number > 0) {
            System.out.println("Positive Number.");
        } else if (number < 0) {
            System.out.println("Negative Number.");
        } else {
            System.out.println("Zero.");
        }
    }
}
