public class MathClass {
    public static void main(String[] args) {
        // Declare and initialize variables
        int x = 10;
        int y = 20;
        int z = -20;
        double a = 9.99;
        int b = 2;
        int c = 3;

        // Using Math.max() to find the maximum of two numbers
        System.out.println("Maximum - " + Math.max(x, y));

        // Using Math.min() to find the minimum of two numbers
        System.out.println("Minimum - " + Math.min(x, y));

        // Using Math.abs() to find the absolute value of a number
        System.out.println("Absolute - " + Math.abs(z));

        // Using Math.round() to round a floating-point number to the nearest integer
        System.out.println("Round - " + Math.round(a));

        // Using Math.pow() to calculate the power of a number
        System.out.println("Power - " + Math.pow(b, c));
    }
}
