// find factorial of n

package Assignment11;

import java.util.Scanner;

public class Assignment11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Integer Number: ");
        int num = input.nextInt();
        int fact = 1;

        for (int i = num; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("Factorial Of "+num+" - "+fact);
    }
}
