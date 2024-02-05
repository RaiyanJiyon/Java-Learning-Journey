import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare matrices A, B, and C
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        int[][] C = new int[2][3];

        // Input elements for matrix A
        System.out.println("Enter Elements For A Matrix: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("A[%d][%d] = ", i, j);
                A[i][j] = input.nextInt();
            }
        }

        // Input elements for matrix B
        System.out.println("Enter Elements For B Matrix: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("B[%d][%d] = ", i, j);
                B[i][j] = input.nextInt();
            }
        }

        // Display matrix A
        System.out.println("\nMatrix A: ");
        printMatrix(A);

        // Display matrix B
        System.out.println("\nMatrix B: ");
        printMatrix(B);

        // Perform matrix addition (A + B) and display the result
        System.out.println("\nA + B: ");
        performMatrixOperation(A, B, C, '+');

        // Perform matrix subtraction (A - B) and display the result
        System.out.println("\nA - B: ");
        performMatrixOperation(A, B, C, '-');

        // Close the Scanner to prevent resource leak
        input.close();
    }

    // Function to print a matrix
    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();  // Move to the next line after printing each row
        }
    }

    // Function to perform matrix addition or subtraction and display the result
    private static void performMatrixOperation(int[][] A, int[][] B, int[][] C, char operation) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (operation == '+') {
                    C[i][j] = A[i][j] + B[i][j];
                } else if (operation == '-') {
                    C[i][j] = A[i][j] - B[i][j];
                }
                System.out.print("\t" + C[i][j]);
            }
            System.out.println();  // Move to the next line after printing each row
        }
    }
}
