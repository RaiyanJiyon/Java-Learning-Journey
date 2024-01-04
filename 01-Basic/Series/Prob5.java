package Series;

import java.util.Scanner;

public class Prob5 {
    public static void main(String[] args) {
        // 1 X 2 X 3 X ......... X n

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Last Number: ");
        int n = input.nextInt();

        int multi = 1;

        // StringBuilder to store the series
        StringBuilder series = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            multi = multi * i;

            // Append the current term to the series
            series.append(i);

            // Append "+" if not the last term
            if (i < n) {
                series.append(" X ");
            }
        }
        System.out.println("Series: " + series.toString() + " = " + multi);
    }
}
