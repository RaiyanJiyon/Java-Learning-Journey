import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare two 2x3 matrices
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];

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
        System.out.println("Matrix A: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();  // Move to the next line after printing each row
        }

        // Display matrix B
        System.out.println("Matrix B: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();  // Move to the next line after printing each row
        }

        // Close the Scanner to prevent resource leak
        input.close();
    }
}
