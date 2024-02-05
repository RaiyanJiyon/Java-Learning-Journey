// Class name should start with a capital letter and follow camelCase
public class BasicArray {
    // Main method to start the execution of the program
    public static void main(String[] args) {
        // Declare an array of integers with a size of 5
        int[] num = new int[5];

        // Initialize array elements with values
        num[0] = 10;
        num[1] = 20;
        num[2] = 30;
        num[3] = 40;
        num[4] = 50;

        // Variable to store the sum of array elements
        int sum = 0;

        // Get the size of the array
        int size = num.length;
        System.out.println("Array Size - " + size);

        // Iterate through the array and calculate the sum of elements
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }

        // Print the sum of array elements
        System.out.println("Sum Of Array Elements - " + sum);
    }
}
