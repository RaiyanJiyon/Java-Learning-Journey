public class DecimalToOctal {
    public static void main(String[] args) {
        // Specify the decimal number
        int decimal = 15;

        // Convert decimal to octal
        String octal = Integer.toOctalString(decimal);

        // Print the result
        System.out.println(decimal + " in octal is - " + octal);
    }
}
