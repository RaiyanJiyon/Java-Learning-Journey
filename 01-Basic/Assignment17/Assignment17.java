package Assignment17;

import java.util.Scanner;

// Create a pattern like following one if n=4
/*
 1
 1 0
 1 0 1
 1 0 1 0
 */
public class Assignment17 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please Enter Last Line: ");
    int num = input.nextInt();

    for (int i = 1; i <= num; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(" "+j % 2);
        }
        System.out.println();
    }
  }
}