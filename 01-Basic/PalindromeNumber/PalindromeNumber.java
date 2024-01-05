package PalindromeNumber;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("Palindrome Number Program -");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Digit: ");
        int digit = input.nextInt();

        int temp = digit;
        int reversed = 0;
        int reminder;

        while (temp != 0) {
            reminder = temp % 10;
            reversed = reversed * 10 + reminder;
            temp = temp / 10;
        }
        System.out.println("Reverse Number - " + reversed);
        
        if (digit == reversed) {
            System.out.println(digit + " is a Palindrome Number.");
        } else {
            System.out.println(digit + " is not a Palindrome Number.");
        }
    }
}
