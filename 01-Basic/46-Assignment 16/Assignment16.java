// validate user based on username and password
// input username and password until username=="anis" and password=="123456"
// if username and password does not match print "username/password is incorrect. Please try again"
// if username and password does not match print "welcome to the system"

import java.util.Scanner;

public class Assignment16 {
    public static void main(String[] args) {
        // Define correct username and password
        String correctUsername = "anis";
        String correctPassword = "123456";

        // Define the number of attempts allowed
        int startingAttempt = 0;
        int endingAttempt = 3;

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Loop until the maximum number of attempts is reached
        while (startingAttempt < endingAttempt) {
            // Prompt the user to enter username
            System.out.print("Enter Username: ");
            String username = input.nextLine();

            // Prompt the user to enter password
            System.out.print("Enter Password: ");
            String password = input.nextLine();

            // Check if the entered username and password match the correct ones
            if (correctUsername.equals(username) && correctPassword.equals(password)) {
                System.out.println("Welcome to the system");
                // Break out of the loop if the credentials are correct
                break;
            } else {
                // Print an error message if the credentials are incorrect
                System.out.println("Username/password is incorrect. Please try again");
                startingAttempt++;
            }
        }

        // Check if the maximum number of attempts is reached
        if (startingAttempt == endingAttempt) {
            System.out.println("Maximum attempts reached. Exiting the system.");
        }
    }
}
