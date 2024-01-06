package PatternPrograms;

import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Line Number: ");
        int num = input.nextInt();

        /*
        n = 5
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
         */

        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" "+col);
            }
            System.out.println();
        }
    }
}
