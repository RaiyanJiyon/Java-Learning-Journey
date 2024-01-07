package Matrix;

import java.util.Scanner;

public class Part3 {
    public static void main(String[] args) {
        int[][] A = new int[3][3];
        int sumOfDiagonalElements = 0;
        int sumOfUpperElements = 0;
        int sumOfLowerElements = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Elements: ");

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("A[%d][%d] - ", i, j);
                A[i][j] = input.nextInt();
            }
        }

        // Sum Of Diagonal Elements
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (i == j) {
                    sumOfDiagonalElements = sumOfDiagonalElements + A[i][j];
                }

                if (i < j) {
                    sumOfUpperElements = sumOfUpperElements + A[i][j];
                }

                if (i > j) {
                    sumOfLowerElements = sumOfLowerElements + A[i][j];
                }
            }
        }

        System.out.println("Sum Of Diagonal Elements - " + sumOfDiagonalElements);
        System.out.println("Sum Of Upper Elements - " + sumOfUpperElements);
        System.out.println("Sum Of Lower Elements - " + sumOfLowerElements);
    }
}
