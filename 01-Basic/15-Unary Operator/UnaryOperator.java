public class UnaryOperator {
    public static void main(String[] args) {
        int x = 10;
        int result;

        // Unary plus operator
        
        result = +x;
        System.err.println(result);

        // Unary minus operator
        
        result = -x;
        System.err.println(result);

        // increment
        int a = 20;
        int b;

        // pre increment
        b = ++a;
        System.err.println("b - "+b);
        // post increment
        b = a++;
        b = a;
        System.err.println("b - "+b);

        // decrement
        int k = 20;
        int j;

        // pre increment
        j = --k;
        System.err.println("j - "+j);
        // post decrement
        k = j--;
        k = j;
        System.err.println("b - "+j);
    }
}
