package ReverseNumber;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Reverse Digits Program: ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Some Digits- ");
        int digit = input.nextInt();

        int sum = 0;
        int reminder, temp;
        temp = digit;

        while (temp != 0) {
            reminder = temp % 10;
            sum = sum * 10 + reminder;
            temp = temp / 10;
        }
        System.out.println("Reverse Number Of "+digit+" Is - "+sum);
    }
}
