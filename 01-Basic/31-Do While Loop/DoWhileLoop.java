public class DoWhileLoop {
    public static void main(String[] args) {
        // Initialize the loop variable i to 2
        int i = 2;

        // Do-while loop to print even numbers from 2 to 100
        do {
            // Print the current value of i
            System.out.println(i);

            // Increment i by 2 for the next iteration
            i = i + 2;

            // Check the loop condition (continue while i is less than or equal to 100)
        } while (i <= 100);
    }
}
