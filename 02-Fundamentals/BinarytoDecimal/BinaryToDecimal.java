package BinarytoDecimal;

public class BinaryToDecimal {
    public static void main(String[] args) {
        String binary = "101";
        int decimal = Integer.parseInt(binary, 2); //here we declare 2 because binary digit required 2 bit.

        System.out.println(binary+" binary to decimal is - "+decimal);
    }
    
}
