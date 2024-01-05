// validate user based on username and password
// input username and password until username=="anis" and password=="123456"
// if username and password does not match print "username/password is incorrect. Please try again"
// if username and password does not match print "welcome to the system"

package Assignment16;

import java.util.Scanner;

public class Assignment16 {
    public static void main(String[] args) {
        String correctUsername = "anis";
        String correctPassword = "123456";
        int startingAttempt = 0;
        int endingAttempt = 3;

        Scanner input = new Scanner(System.in);

        while (startingAttempt < endingAttempt) {
            System.out.print("Enter Username: ");
            String username = input.nextLine();

            System.out.print("Enter Password: ");
            String password = input.nextLine();

            if (correctUsername.equals(username) && correctPassword.equals(password)) {
                System.out.println("Welcome to the system");
                break;
            } else {
                System.out.println("Username/password is incorrect. Please try again");
                startingAttempt++;
            }
        }

        if (startingAttempt == endingAttempt) {
            System.out.println("Maximum attempts reached. Exiting the system.");
        }
    }
}

