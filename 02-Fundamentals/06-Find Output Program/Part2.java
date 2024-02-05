public class Part2 {
    public static void main(String[] args) {

        /*
         Output -
         0
         1 2
         3 4 5
         6 7 8 9
         */
        int k = 0;

        // Declare a jagged array with varying row sizes
        int[][] num = new int[4][];
        num[0] = new int[1];
        num[1] = new int[2];
        num[2] = new int[3];
        num[3] = new int[4];

        // Populate the array with sequential numbers
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                num[i][j] = k;
                k++;
            }
        }

        // Print the triangular pattern
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" " + num[i][j]);
            }
            System.out.println();
        }
    }
}
