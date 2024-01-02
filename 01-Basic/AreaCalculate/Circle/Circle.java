package AreaCalculate.Circle;

import java.lang.Math;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.err.print("Enter Radius: ");
        double radius = input.nextDouble();

        double result = Math.PI * (radius * radius);

        System.err.printf("Area Of Circle - %.2f", result);
    }
}
