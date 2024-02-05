public class OctalToDecimal {
    public static void main(String[] args) {
        // Specify the octal string
        String octal = "765";

        // Convert octal to decimal
        int decimal = Integer.parseInt(octal, 8);

        // Print the result
        System.out.println(octal + " octal to decimal is - " + decimal);
    }
}
