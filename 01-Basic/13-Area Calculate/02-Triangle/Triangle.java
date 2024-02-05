import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the base of the triangle
        System.err.print("Enter Base: ");
        double base = input.nextDouble();

        // Prompt the user to enter the height of the triangle
        System.err.print("Enter Height: ");
        double height = input.nextDouble();

        // Calculate the area of the triangle using the formula A = 0.5 * base * height
        double result = 0.5 * base * height;

        // Display the calculated area with two decimal places
        System.err.printf("Area Of Triangle - %.2f", result);
    }
}
