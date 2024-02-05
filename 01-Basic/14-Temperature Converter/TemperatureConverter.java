import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Celsius to Fahrenheit conversion formula: F = (9/5)C + 32
        System.out.println("Celsius To Fahrenheit Program- ");

        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter temperature in Celsius
        System.out.print("Enter Celsius: ");
        double celsius = input.nextDouble();

        // Convert Celsius to Fahrenheit using the formula
        double fahrenheit = (9.0 / 5) * celsius + 32;

        // Display the converted temperature in Fahrenheit
        System.out.println("Celsius To Fahrenheit - " + fahrenheit);
    }
}
