package PrimeNumber;

import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Integer Number: ");
        int num = input.nextInt();
        int count = 0;

        if (num == 0 || num == 1) {
            System.out.println("Not a Prime Number.");
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            } 
            if (count == 0) {
                System.out.println(num + " is a Prime Number");
            } else {
                System.out.println(num + " is not a Prime Number");
            }
        }
    }
}
