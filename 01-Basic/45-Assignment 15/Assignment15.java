import java.util.Scanner;

public class Assignment15 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        try (Scanner input = new Scanner(System.in)) {
            // Prompt the user to enter the start number
            System.out.print("Start number: ");
            int m = input.nextInt();

            // Prompt the user to enter the end number
            System.out.print("End number: ");
            int n = input.nextInt();

            // Initialize a variable to count the total Armstrong numbers
            int totalArmstrongNumber = 0;

            // Display the range for which Armstrong numbers will be found
            System.out.println("Armstrong numbers between " + m + " and " + n + ":");

            // Loop through each number in the specified range
            for (int num = m; num <= n; num++) {
                int original = num;
                int reversed = 0;
                int temp = num;

                // Calculate the sum of cubes of individual digits
                while (temp != 0) {
                    int remainder = temp % 10;
                    reversed = reversed + remainder * remainder * remainder;
                    temp = temp / 10;
                }

                // Check if the number is an Armstrong number
                if (original == reversed) {
                    // Print the Armstrong number and increment the count
                    System.out.print(original + " ");
                    totalArmstrongNumber++;
                }
            }

            // Display the total number of Armstrong numbers found
            System.out.println("\nTotal Armstrong numbers: " + totalArmstrongNumber);
        }
    }
}
