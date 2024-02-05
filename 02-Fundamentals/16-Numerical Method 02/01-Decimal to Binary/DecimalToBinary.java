public class DecimalToBinary {
    public static void main(String[] args) {
        // Specify the decimal number
        int decimal = 15;

        // Convert decimal to binary
        String binary = Integer.toBinaryString(decimal);

        // Print the result
        System.out.println(decimal + " in binary is - " + binary);
    }
}
