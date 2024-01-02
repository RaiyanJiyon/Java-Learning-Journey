package ControlStatement;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println("Positive Number.");
        } else if (number < 0) {
            System.out.println("Negative Number.");
        } else {
            System.out.println("Zero.");
        }
    }
}
