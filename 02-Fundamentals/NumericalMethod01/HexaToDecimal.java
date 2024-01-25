package NumericalMethod01;

public class HexaToDecimal {
    public static void main(String[] args) {
        String hexa = "A";
        int decimal = Integer.parseInt(hexa, 16); // here we declare 16 because hexa digit required 16 bit.

        System.out.println(hexa + " hexa to decimal is - " + decimal);
    }

}
