package Assignment13;

import java.util.Scanner;
public class Assignment13 {
  public static void main(String[] args) {
    int first = 0;
    int second = 1;
    int fibo;

    try (Scanner input = new Scanner(System.in)) {

      System.out.print("which fibonacci number you want to see? ");
      int n = input.nextInt();
      
      System.out.print(first+ " "+second);

      for (int i = 3; i <= n; i++) {
        fibo = first + second;
        System.out.print(" " + fibo);
        first = second;
        second = fibo;
      }
      System.out.println("\n");
    }
  }
}