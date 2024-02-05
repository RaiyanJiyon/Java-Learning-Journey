public class ForEachLoop {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] num = {10, 20, 30, 40, 50};
        
        // Variable to store the sum of array elements
        int sum = 0;

        // Iterate through the array using a for-each loop
        // Each element 'i' in 'num' is added to the sum
        for (int x : num) {
            sum += x;
        }

        // Output the sum of array elements
        System.out.println("Sum: " + sum);
    }
}
