import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a single digit
        System.out.println("Enter Any One Digit: ");
        int digit = input.nextInt();

        // Use a switch statement to determine the word representation of the entered digit
        switch (digit) {
            case 0:
                System.out.println("Zero");
                break;

            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");
                break;

            case 3:
                System.out.println("Three");
                break;

            case 4:
                System.out.println("Four");
                break;

            case 5:
                System.out.println("Five");
                break;

            case 6:
                System.out.println("Six");
                break;

            case 7:
                System.out.println("Seven");
                break;

            case 8:
                System.out.println("Eight");
                break;

            case 9:
                System.out.println("Nine");
                break;

            default:
                System.out.println("Not a Valid Input."); // Displayed if the user enters a digit outside the range [0-9]
        }
    }
}
