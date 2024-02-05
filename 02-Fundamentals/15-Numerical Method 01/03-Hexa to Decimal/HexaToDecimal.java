public class HexaToDecimal {
    public static void main(String[] args) {
        // Specify the hexadecimal string
        String hexa = "A";

        // Convert hexadecimal to decimal
        int decimal = Integer.parseInt(hexa, 16);

        // Print the result
        System.out.println(hexa + " hexa to decimal is - " + decimal);
    }
}
