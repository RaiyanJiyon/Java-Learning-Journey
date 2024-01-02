/*
 * valid voter program using if,else 
 * step 1: ask for a person age
 * step 2: if age is equal or more than 18 than print valid voter
 * step 3: else print invalid voter
 */

package Assignment5;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("Valid Voter.");
        } else {
            System.out.println("Invalid Voter.");
        }
    }
}
