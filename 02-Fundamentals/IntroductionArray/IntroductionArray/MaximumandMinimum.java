package IntroductionArray;

import java.util.Scanner;

public class MaximumandMinimum {
    public static void main(String[] args) {
        int[] num = new int[5];
        Scanner input = new Scanner(System.in);

        // Taking input for array elements
        System.out.println("Enter 5 Numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            num[i] = input.nextInt();
        }

        // Calculating the sum
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + num[i];
        }

        // Calculating the average
        int avg = sum / num.length;

        System.out.println("Sum Of 5 Numbers: " + sum);
        System.out.println("Average Of 5 Numbers: " + avg);

        // Finding Maximum and Minimum
        double max = num[0];
        double min = num[0];

        for (int i = 1; i < 5; i++) {
            if (max < num[i]) {
                max = num[i];
            }
            if (min > num[i]) {
                min = num[i];
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}