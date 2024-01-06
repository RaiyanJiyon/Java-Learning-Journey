package PatternPrograms;

import java.util.Scanner;

public class Que5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Last Line: ");
        int num = input.nextInt();

        /*
        n = 5
         1
         0 0
         1 1 1
         0 0 0 0 
         1 1 1 1 1
         */

         for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" "+i % 2);
            }
            System.out.println();
         }
    }
}
