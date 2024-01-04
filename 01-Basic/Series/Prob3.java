package Series;

import java.util.Scanner;

public class Prob3 {
    public static void main(String[] args) {
        // 1.5 + 2.5 + 3.5 + ......... + n

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Last Number: ");
        double n = input.nextDouble();

        double sum = 0;

        // StringBuilder to store the series
        StringBuilder series = new StringBuilder();

        for (double i = 1.5; i <= n; i++) {
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
