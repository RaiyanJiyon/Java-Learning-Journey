package PatternPrograms;

import java.util.Scanner;

public class Que6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Last Line: ");
        int num = input.nextInt();

        /*
         A
         A B
         A B C
         A B C D
         A B C D E
         */

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                // Convert ASCII value to char and print
                System.out.print(" " + (char) (j + 64));
            }
            System.out.println();
        }
    }
}
