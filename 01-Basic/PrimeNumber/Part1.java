package PrimeNumber;

import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Integer Number: ");
        int num = input.nextInt();
        int count = 0;

        for (int i = 2; i < num; i++) {
            if (num % 2 == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println(num+" is a Prime Number.");
        } else {
            System.out.println(num+" is a not Prime Number.");
        }
    }
}
