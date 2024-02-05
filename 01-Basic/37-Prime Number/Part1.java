import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an integer number
        System.out.print("Enter Integer Number: ");
        int num = input.nextInt();
        
        // Initialize a variable to count the factors
        int count = 0;

        // Check for factors in the range from 2 to num-1
        for (int i = 2; i < num; i++) {
            // Check if num is divisible by i (i is a factor)
            if (num % i == 0) {
                count++;
                break; // Break out of the loop if a factor is found
            }
        }

        // Check if count is still 0 (no factors found), then it's a prime number
        if (count == 0) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is not a Prime Number.");
        }
    }
}
