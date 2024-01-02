package TemperatureConverter;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Celsius to Fahrenheit
        // F = 9/5 C + 32

        System.out.println("Celsius To Fahrenheit Program- ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Celsius: ");

        double celsius = input.nextDouble();

        double Fahrenheit = (9.0 / 5) * celsius + 32;

        System.out.println("Celsius To Fahrenheit - " + Fahrenheit);
    }
}
