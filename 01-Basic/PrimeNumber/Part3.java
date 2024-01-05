package PrimeNumber;

import java.util.Scanner;

public class Part3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Starting Number: ");
        int startingNum = input.nextInt();
        System.out.print("Enter Ending Number: ");
        int endingNum = input.nextInt();
        int totalPrime = 0;

        if (startingNum <= 1 || endingNum <= 1) {
            System.out.println("Prime numbers start from 2. Please enter valid starting and ending numbers.");
            return;
        }

        System.out.println("Prime Numbers are between " + startingNum + " to " + endingNum);

        for (int i = startingNum; i <= endingNum; i++) {
            int count = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.print(i + " ");
                totalPrime++;
            }
            count = 0;
        }
        System.out.println("\nTotal Prime Numbers are in this list - " + totalPrime);
    }
}
