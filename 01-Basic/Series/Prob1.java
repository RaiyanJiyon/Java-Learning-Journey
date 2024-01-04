package Series;

import java.util.Scanner;

public class Prob1 {
    public static void main(String[] args) {
        // 1 + 2 + 3 + ......... + n

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Last Number: ");
        int n = input.nextInt();

        int sum = 0;

        // StringBuilder to store the series
        StringBuilder series = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            sum = sum + i;

            // Append the current term to the series
            series.append(i);

            // Append "+" if not the last term
            if (i < n) {
                series.append(" + ");
            }
        }
        System.out.println("Series: " + series.toString() + " = " + sum);
    }
}
