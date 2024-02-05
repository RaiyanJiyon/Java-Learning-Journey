public class PremitiveToString {
    public static void main(String[] args) {
        // Convert int to String
        int x = 10;
        System.out.println("Value of x Integer - " + x);
        String s = Integer.toString(x);
        System.out.println("Value of s String - " + s);

        // Convert double to String
        double x2 = 10.22;
        System.out.println("Value of x Double - " + x2);
        String s2 = Double.toString(x2);
        System.out.println("Value of s2 String - " + s2);

        // Convert boolean to String
        Boolean x3 = true;
        System.out.println("Value of x3 Boolean - " + x3);
        String s3 = Boolean.toString(x3);
        System.out.println("Value of s3 String - " + s3);
    }
}
