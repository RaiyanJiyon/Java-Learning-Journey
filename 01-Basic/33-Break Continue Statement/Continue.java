public class Continue {
    public static void main(String[] args) {
        // Loop to iterate through numbers from 1 to 100 with a step of 3
        for (int i = 1; i <= 100; i = i + 3) {
            // Check if the current value of i is equal to 10
            if (i == 10) {
                // If i is equal to 10, skip the rest of the loop's body for this iteration
                continue;
            }
            // Print the current value of i
            System.out.println(i);
        }
    }
}
