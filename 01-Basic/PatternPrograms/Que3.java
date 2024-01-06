package PatternPrograms;

import java.util.Scanner;

public class Que3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Last Line: ");
        int num = input.nextInt();

        /*
         1
         2 2
         2 2 3
         2 2 3 4
         2 2 3 4 5
         */

         for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" "+i);
            }
            System.out.println();
         }
    }
}
