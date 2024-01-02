package AreaCalculate.Triangle;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.err.print("Enter Base: ");
        double base = input.nextDouble();

        System.err.print("Enter Height: ");
        double height = input.nextDouble();

        double result = 0.5 * base * height;

        System.err.printf("Area Of Trianlge - %.2f",result);
    }
}
