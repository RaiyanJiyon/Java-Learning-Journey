package MathClass;

public class MathClass {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = -20;
        double a = 9.99;
        int b = 2;
        int c = 3;

        System.out.println("Maximum - " + Math.max(x, y));
        System.out.println("Minimum - " + Math.min(x, y));
        System.out.println("Absolute - " + Math.abs(z));
        System.out.println("Round - " + Math.round(a));
        System.out.println("Power - " + Math.pow(b, c));
    }
}
