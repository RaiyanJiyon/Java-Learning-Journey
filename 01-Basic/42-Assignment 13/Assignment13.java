import java.util.Scanner;

public class Assignment13 {
    public static void main(String[] args) {
        // Initialize the first two numbers of the Fibonacci sequence
        int first = 0;
        int second = 1;
        int fibo;

        // Create a Scanner object for user input
        try (Scanner input = new Scanner(System.in)) {
            // Prompt the user to enter the position of the Fibonacci number
            System.out.print("Which Fibonacci number do you want to see? ");
            int n = input.nextInt();

            // Display the first two numbers in the Fibonacci sequence
            System.out.print(first + " " + second);

            // Calculate and display the remaining Fibonacci numbers
            for (int i = 3; i <= n; i++) {
                fibo = first + second;
                System.out.print(" " + fibo);
                first = second;
                second = fibo;
            }
            System.out.println("\n");
        }
    }
}
