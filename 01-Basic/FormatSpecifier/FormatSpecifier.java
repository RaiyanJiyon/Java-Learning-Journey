package FormatSpecifier;

public class FormatSpecifier {
    public static void main(String[] args) {
        boolean b = true;
        char c = 'a';
        int i = 201912;
        short s = (short) 126587;
        float f = 10.22222f;
        double d = 10.2;
        
        // we have to write printf instead of println when we gonna use Format Specfier.
        System.err.printf("boolean b = %b\n", b);
        System.err.printf("char c = %c\n", c);
        System.out.printf("int i = %d\n", i);
        System.err.printf("short s = %d\n", s);
        System.err.printf("float f = %.2f\n", f);
        System.err.printf("double d = %f\n", d);
    }
}
