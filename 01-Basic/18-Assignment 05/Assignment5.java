/*
 * valid voter program using if,else 
 * step 1: ask for a person age
 * step 2: if age is equal or more than 18 than print valid voter
 * step 3: else print invalid voter
 */

 import java.util.Scanner;

 public class Assignment5 {
     public static void main(String[] args) {
         // Create a Scanner object to read user input
         Scanner input = new Scanner(System.in);
 
         // Prompt the user to enter their age
         System.out.print("Enter Your Age: ");
         int age = input.nextInt();
 
         // Check the age using if-else statement
         if (age >= 18) {
             System.out.println("Valid Voter.");
         } else {
             System.out.println("Invalid Voter.");
         }
     }
 }
 