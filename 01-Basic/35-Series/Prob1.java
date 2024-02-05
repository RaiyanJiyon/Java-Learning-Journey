import java.util.Scanner;

public class Prob1 {
    public static void main(String[] args) {
        // 1 + 2 + 3 + ......... + n

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the last number
        System.out.print("Enter Last Number: ");
        int n = input.nextInt();

        // Initialize a variable to store the sum
        int sum = 0;

        // StringBuilder to store the series
        StringBuilder series = new StringBuilder();

        // Loop to calculate the sum and build the series
        for (int i = 1; i <= n; i++) {
            sum = sum + i;

            // Append the current term to the series
            series.append(i);

            // Append "+" if not the last term
            if (i < n) {
                series.append(" + ");
            }
        }

        // Display the series and its sum
        System.out.println("Series: " + series.toString() + " = " + sum);
    }
}
