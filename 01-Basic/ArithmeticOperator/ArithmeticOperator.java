package ArithmeticOperator;
import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (num1): ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number (num2): ");
        int num2 = scanner.nextInt();

        int result;

        result = num1 + num2;
        System.out.println("Sum: " + result);

        result = num1 - num2;
        System.out.println("Difference: " + result);

        result = num1 * num2;
        System.out.println("Multiplication: " + result);

        double result2 = (double) num1 / num2;
        System.out.println("Division: " + result2);

        result = num1 % num2;
        System.out.println("Reminder: " + result);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
