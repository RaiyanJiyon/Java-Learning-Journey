package ArmstrongNumber;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Armstrong Program: ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Some Digits- ");
        int digit = input.nextInt();

        int temp = digit;
        int reverse = 0;
        int remainder;

        while (temp != 0) {
            remainder = temp % 10;
            reverse = reverse + remainder * remainder * remainder;
            temp = temp / 10;
        }
        if (digit == reverse) {
            System.out.println(digit+" is a Armstrong Number.");
        } else {
            System.out.println(digit+" is not a Armstrong Number.");
        }


    }
}
