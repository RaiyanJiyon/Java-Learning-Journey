// find sum of 1-10 using for loop

public class Assignment10 {
    public static void main(String[] args) {
        // Initialize a variable to store the sum
        int result = 0;

        // Loop to iterate through numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            // Accumulate the sum by adding the current value of i
            result = result + i;
        }

        // Display the sum of numbers from 1 to 10
        System.out.println("Sum Of (1-10) Digit - " + result);
    }
}
