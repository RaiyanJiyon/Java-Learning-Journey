import java.lang.Math;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle
        System.err.print("Enter Radius: ");
        double radius = input.nextDouble();

        // Calculate the area of the circle using the formula A = π * r^2
        double result = Math.PI * (radius * radius);

        // Display the calculated area with two decimal places
        System.err.printf("Area Of Circle - %.2f", result);
    }
}
