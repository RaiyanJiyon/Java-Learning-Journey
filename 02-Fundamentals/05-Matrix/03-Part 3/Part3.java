import java.util.Scanner;

public class Part3 {
    public static void main(String[] args) {
        // Declare a 3x3 matrix and variables for sums
        int[][] A = new int[3][3];
        int sumOfDiagonalElements = 0;
        int sumOfUpperElements = 0;
        int sumOfLowerElements = 0;

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Elements: ");

        // Input elements for matrix A
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("A[%d][%d] - ", i, j);
                A[i][j] = input.nextInt();
            }
        }

        // Calculate sums of diagonal, upper, and lower elements
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (i == j) {
                    sumOfDiagonalElements += A[i][j];
                }

                if (i < j) {
                    sumOfUpperElements += A[i][j];
                }

                if (i > j) {
                    sumOfLowerElements += A[i][j];
                }
            }
        }

        // Output the sums
        System.out.println("Sum Of Diagonal Elements - " + sumOfDiagonalElements);
        System.out.println("Sum Of Upper Elements - " + sumOfUpperElements);
        System.out.println("Sum Of Lower Elements - " + sumOfLowerElements);

        // Close the Scanner to prevent resource leak
        input.close();
    }
}
