public class TwoDArray {
    public static void main(String[] args) {
        // Declare a 2D array with 2 rows and 3 columns
        int[][] num = new int[2][3];

        // Initialize array elements
        num[0][0] = 10;
        num[0][1] = 20;
        num[0][2] = 30;
        num[1][0] = 40;
        num[1][1] = 50;
        num[1][2] = 60;

        // Loop through the array to print its elements
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
        System.out.println(); // Add an extra line for better output formatting
    }
}
