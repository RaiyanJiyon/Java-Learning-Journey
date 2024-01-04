// print sum of odd numbers from m-n

package Assignment12;

import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Starting Number: ");
        int m = input.nextInt();
        System.out.print("Enter Ending Number: ");
        int n = input.nextInt();

        int sum = 0;

        for (int i = m; i <= n; i = i + 2) {
            sum = sum + i;
        }
        System.out.println("Sum Of ODD Number Between "+m+" To "+n+" Is - "+sum);
    }
}
