package TemperatureConverter;

import java.util.Scanner;

public class TemperatureConverter2 {
    public static void main(String[] args) {
        // Celsius to Fahrenheit
        // C = 5/9*(F-32)

        System.out.println("Fahrenheit To Celsius Program- ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Fahrenheit: ");

        double Fahrenheit = input.nextDouble();

        double Celsius = 5.0/9 * (Fahrenheit-32);

        System.out.println("Fahrenheit To Celsius Program- " + Celsius);
    }
}
