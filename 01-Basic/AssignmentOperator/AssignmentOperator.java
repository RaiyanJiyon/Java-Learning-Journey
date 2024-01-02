package AssignmentOperator;

public class AssignmentOperator {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;

        x += y; // x = x + y 
        System.err.println("x-"+x);

        x -= y; // x = x - y 
        System.err.println("x-"+x);

        x *= y; // x = x * y 
        System.err.println("x-"+x);

        x /= y; // x = x / y 
        System.err.println("x-"+x);

        x %= y; // x = x % y 
        System.err.println("x-"+x);
    }
}
