import java.util.Scanner;

public class Prob5 {
    public static void main(String[] args) {
        // 1 X 2 X 3 X ......... X n

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the last number
        System.out.print("Enter Last Number: ");
        int n = input.nextInt();

        // Initialize a variable to store the product
        int multi = 1;

        // StringBuilder to store the series
        StringBuilder series = new StringBuilder();

        // Loop to calculate the product and build the series
        for (int i = 1; i <= n; i++) {
            multi = multi * i;

            // Append the current term to the series
            series.append(i);

            // Append "X" if not the last term
            if (i < n) {
                series.append(" X ");
            }
        }

        // Display the series and its product
        System.out.println("Series: " + series.toString() + " = " + multi);
    }
}
