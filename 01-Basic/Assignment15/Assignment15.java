package Assignment15;

import java.util.Scanner;

public class Assignment15 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Start number: ");
            int m = input.nextInt();

            System.out.print("End number: ");
            int n = input.nextInt();

            int totalArmstrongNumber = 0;

            System.out.println("Armstrong numbers between " + m + " and " + n + ":");
            for (int num = m; num <= n; num++) {
                int original = num;
                int reversed = 0;
                int temp = num;

                while (temp != 0) {
                    int remainder = temp % 10;
                    reversed = reversed + remainder * remainder * remainder;
                    temp = temp / 10;
                }

                if (original == reversed) {
                    System.out.print(original + " ");
                    totalArmstrongNumber++;
                }
            }

            System.out.println("\nTotal Armstrong numbers: " + totalArmstrongNumber);
        }
    }
}
