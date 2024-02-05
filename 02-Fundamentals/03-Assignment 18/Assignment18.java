
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

import java.util.Scanner;

public class Assignment18 {
    public static void main(String[] args) {
        // Declare an array to store day numbers
        int[] num = new int[7];

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Loop to input day numbers
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter day number (1-7): ");
            num[i] = input.nextInt();

            // Use a switch statement for better readability
            switch (num[i]) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid day number. Please enter a number between 1 and 7.");
                    // Decrement i to re-enter the correct day number
                    i--;
                    break;
            }
        }

        // Close the Scanner to prevent resource leak
        input.close();
    }
}
