import java.util.Scanner;

public class SumandAverage {
    public static void main(String[] args) {
        // Declare an array to store 5 numbers
        int[] num = new int[5];
        
        // Create a Scanner object for user input
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
        // Using double for average to keep decimal places
        double avg = (double) sum / num.length;

        // Outputting the sum and average
        System.out.println("Sum Of 5 Numbers: " + sum);
        System.out.println("Average Of 5 Numbers: " + avg);
        
        // Close the Scanner to prevent resource leak
        input.close();
    }
}
