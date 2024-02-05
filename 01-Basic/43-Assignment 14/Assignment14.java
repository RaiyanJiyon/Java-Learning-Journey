import java.util.Scanner;

public class Assignment14 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        try (Scanner input = new Scanner(System.in)) {
            // Prompt the user to enter the start number
            System.out.print("Start number: ");
            int m = input.nextInt();

            // Prompt the user to enter the end number
            System.out.print("End number: ");
            int n = input.nextInt();

            // Initialize a variable to count the total palindrome numbers
            int totalPalindromeNumber = 0;

            // Display the range for which palindrome numbers will be found
            System.out.println("Palindrome numbers between " + m + " and " + n + ":");

            // Loop through each number in the specified range
            for (int num = m; num <= n; num++) {
                int original = num;
                int reversed = 0;
                int temp = num;

                // Reverse the number
                while (temp != 0) {
                    int remainder = temp % 10;
                    reversed = reversed * 10 + remainder;
                    temp = temp / 10;
                }

                // Check if the original number is equal to the reversed number
                if (original == reversed) {
                    // Print the palindrome number and increment the count
                    System.out.print(original + " ");
                    totalPalindromeNumber++;
                }
            }

            // Display the total number of palindrome numbers found
            System.out.println("\nTotal Palindrome numbers: " + totalPalindromeNumber);
        }
    }
}
