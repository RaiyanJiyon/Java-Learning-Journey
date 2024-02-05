import java.util.Scanner;

public class Part3 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the starting number
        System.out.print("Enter Starting Number: ");
        int startingNum = input.nextInt();

        // Prompt the user to enter the ending number
        System.out.print("Enter Ending Number: ");
        int endingNum = input.nextInt();

        // Initialize a variable to count the total prime numbers
        int totalPrime = 0;

        // Check if the starting and ending numbers are valid
        if (startingNum <= 1 || endingNum <= 1) {
            System.out.println("Prime numbers start from 2. Please enter valid starting and ending numbers.");
            return;
        }

        // Display the range for which prime numbers will be found
        System.out.println("Prime Numbers are between " + startingNum + " to " + endingNum);

        // Loop through each number in the specified range
        for (int i = startingNum; i <= endingNum; i++) {
            int count = 0;

            // Check for factors in the range from 2 to i/2
            for (int j = 2; j <= i / 2; j++) {
                // Check if i is divisible by j (j is a factor)
                if (i % j == 0) {
                    count++;
                    break; // Break out of the loop if a factor is found
                }
            }

            // Check if count is still 0 (no factors found), then it's a prime number
            if (count == 0) {
                // Print the prime number and increment the count
                System.out.print(i + " ");
                totalPrime++;
            }

            // Reset the count for the next iteration
            count = 0;
        }

        // Display the total number of prime numbers found
        System.out.println("\nTotal Prime Numbers are in this list - " + totalPrime);
    }
}
