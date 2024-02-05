public class BinaryToDecimal {
    public static void main(String[] args) {
        // Specify the binary string
        String binary = "101";

        // Convert binary to decimal
        int decimal = Integer.parseInt(binary, 2);

        // Print the result
        System.out.println(binary + " binary to decimal is - " + decimal);
    }
}
