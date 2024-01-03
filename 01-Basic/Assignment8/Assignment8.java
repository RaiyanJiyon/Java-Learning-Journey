// Logical AND assignment
// Check eligible candidate
// Step 1: Ask the candidate have you completed your masters? y/n 
// Step 2: Ask the candidate are you fulent in English? y/n 
// Step 3: if the candidate has passed masters and also have fluent english skill then print you are eligible to for the job interview
// Step 4: else print Sorry. you are not eligible to for the job interview

package Assignment8;

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Have You Completed Your Masters? y/n");
        char choice1 = input.next().toLowerCase().charAt(0);

        System.out.println("Are You Fluent In English? y/n");
        char choice2 = input.next().toLowerCase().charAt(0);

        if (choice1 == 'y' && choice2 == 'y') {
            System.out.println("You are eligible for the job interview.");
        } else if (choice1 == 'n' && choice2 == 'n') {
            System.out.println("Sorry, you are not eligible for the job interview.");
        } else {
            System.out.println("Not a valid input.");
        }
    }
}

