package Matrix;

import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        int[][] C = new int[2][3];

        System.out.println("Enter Elements For A Matrix: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("A[%d][%d] = ", i, j);
                A[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter Elements For B Matrix: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("B[%d][%d] = ", i, j);
                B[i][j] = input.nextInt();
            }
        }

        System.out.println("\n\n");

        System.out.println("Matrix A: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();  // Move to the next line after printing each row
        }

        System.out.println("\n\n");

        System.out.println("Matrix B: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();  // Move to the next line after printing each row
        }

        System.out.println("\n\n");

        System.out.println("A + B: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.err.print("\t "+C[i][j]);
            }
            System.out.println();  // Move to the next line after printing each row
        }

        System.out.println("\n\n");

        System.out.println("A - B: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = A[i][j] - B[i][j];
                System.err.print("\t "+C[i][j]);
            }
            System.out.println();  // Move to the next line after printing each row
        }
    }
}
