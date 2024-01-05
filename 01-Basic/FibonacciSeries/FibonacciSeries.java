package FibonacciSeries;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int fibo;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter How Many Fibonacci Numbers You Want to See: ");
        int num = input.nextInt();
        System.out.print(first + " " + second);

        for (int i = 3; i <= num; i++) {
            fibo = first + second;
            System.out.print(" " + fibo);
            first = second;
            second = fibo;
        }
        System.out.println("\n");
    }
}
