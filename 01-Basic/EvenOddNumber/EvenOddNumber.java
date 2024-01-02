package EvenOddNumber;

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Valid Number: ");
        int number = input.nextInt();

        if (number == 0 || (number % 2 == 0)) {
            System.out.println("Even Number.");
        } else if (number > 0 && number % 2 != 0) {
            System.out.println("Odd Number.");
        } else {
            System.out.println("Invalid Number.");
        }
    }
}
