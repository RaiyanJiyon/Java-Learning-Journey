package Assignment18;

import java.util.Scanner;

/*
 * Assigment 18 (Print the day name)
 * declare an array of weekdays 
 * User will give a day number you have to print the equivalent day name
 * 
 * Example 1
 * input-> Enter day number (1-7) : 1
 * output-> Monday
 * 
 * Example 2
 * input-> Enter day number (1-7) : 3
 * output-> Wednesday
 */

public class Assignment18 {
  public static void main(String[] args) {
    int[] num = new int[7];

    Scanner input = new Scanner(System.in);

    for (int i = 0; i < num.length; i++) {
        System.out.print("Enter day number (1-7): ");
        num[i] = input.nextInt();

        if (num[i] == 1) {
            System.out.println("Monday");
        } else if (num[i] == 2) {
            System.out.println("Tuesday");
        } else if (num[i] == 3) {
            System.out.println("Wednesday");
        } else if (num[i] == 4) {
            System.out.println("Thursday");
        } else if (num[i] == 5) {
            System.out.println("Friday");
        } else if (num[i] == 6) {
            System.out.println("Saturday");
        } else if (num[i] == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day number. Please enter a number between 1 and 7.");
            i--;  // Decrement i to re-enter the correct day number
        }
    }
  }
}
