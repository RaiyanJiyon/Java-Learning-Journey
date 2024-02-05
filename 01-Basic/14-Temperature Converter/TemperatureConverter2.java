import java.util.Scanner;

public class TemperatureConverter2 {
    public static void main(String[] args) {
        // Fahrenheit to Celsius conversion formula: C = (5/9) * (F - 32)
        System.out.println("Fahrenheit To Celsius Program- ");

        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter temperature in Fahrenheit
        System.out.print("Enter Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Convert Fahrenheit to Celsius using the formula
        double celsius = (5.0 / 9) * (fahrenheit - 32);

        // Display the converted temperature in Celsius
        System.out.println("Fahrenheit To Celsius Program- " + celsius);
    }
}
