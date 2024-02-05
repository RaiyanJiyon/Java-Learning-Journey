import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Initialize the first two numbers of the Fibonacci sequence
        int first = 0;
        int second = 1;
        int fibo;

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter how many Fibonacci numbers they want to see
        System.out.print("Enter How Many Fibonacci Numbers You Want to See: ");
        int num = input.nextInt();

        // Display the first two numbers in the Fibonacci sequence
        System.out.print(first + " " + second);

        // Calculate and display the remaining Fibonacci numbers
        for (int i = 3; i <= num; i++) {
            fibo = first + second;
            System.out.print(" " + fibo);
            first = second;
            second = fibo;
        }

        System.out.println("\n");
    }
}
