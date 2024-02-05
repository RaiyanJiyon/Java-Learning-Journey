public class Break {
    public static void main(String[] args) {
        // Loop to iterate through odd numbers from 1 to 100
        for (int i = 1; i <= 100; i = i + 2) {
            // Check if the current value of i is equal to 10
            if (i == 10) {
                // If i is equal to 10, break out of the loop
                break;
            }
            // Print the current value of i
            System.out.println(i);
        }
    }
}
