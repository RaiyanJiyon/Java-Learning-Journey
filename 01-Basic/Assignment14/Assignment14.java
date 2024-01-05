package Assignment14;

import java.util.Scanner;

public class Assignment14 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Start number: ");
            int m = input.nextInt();

            System.out.print("End number: ");
            int n = input.nextInt();

            int totalPalindromeNumber = 0;

            System.out.println("Palindrome numbers between " + m + " and " + n + ":");
            for (int num = m; num <= n; num++) {
                int original = num;
                int reversed = 0;
                int temp = num;

                while (temp != 0) {
                    int remainder = temp % 10;
                    reversed = reversed * 10 + remainder;
                    temp = temp / 10;
                }

                if (original == reversed) {
                    System.out.print(original + " ");
                    totalPalindromeNumber++;
                }
            }

            System.out.println("\nTotal Palindrome numbers: " + totalPalindromeNumber);
        }
    }
}
