import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the starting number
        System.out.print("Enter Starting Number: ");
        int m = input.nextInt();

        // Prompt the user to enter the ending number
        System.out.print("Enter Ending Number: ");
        int n = input.nextInt();

        // Initialize a variable to store the sum of odd numbers
        int sum = 0;

        // Loop to calculate the sum of odd numbers in the specified range
        for (int i = m; i <= n; i = i + 2) {
            sum = sum + i;
        }

        // Display the sum of odd numbers in the specified range
        System.out.println("Sum Of ODD Number Between " + m + " To " + n + " Is - " + sum);
    }
}
