// Logical AND assignment
// Check eligible candidate
// Step 1: Ask the candidate have you completed your masters? y/n 
// Step 2: Ask the candidate are you fulent in English? y/n 
// Step 3: if the candidate has passed masters and also have fluent english skill then print you are eligible to for the job interview
// Step 4: else print Sorry. you are not eligible to for the job interview

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user about completing Masters
        System.out.println("Have You Completed Your Masters? y/n");
        char choice1 = input.next().toLowerCase().charAt(0);  // Convert the input to lowercase and get the first character

        // Prompt the user about English fluency
        System.out.println("Are You Fluent In English? y/n");
        char choice2 = input.next().toLowerCase().charAt(0);  // Convert the input to lowercase and get the first character

        // Check eligibility based on user's choices
        if (choice1 == 'y' && choice2 == 'y') {
            System.out.println("You are eligible for the job interview.");
        } else if (choice1 == 'n' && choice2 == 'n') {
            System.out.println("Sorry, you are not eligible for the job interview.");
        } else {
            System.out.println("Not a valid input.");  // Displayed if the user enters something other than 'y' or 'n'
        }
    }
}
