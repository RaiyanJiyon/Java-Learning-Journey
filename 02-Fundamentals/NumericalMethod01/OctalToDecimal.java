package NumericalMethod01;

class OctalToDecimal {

    public static void main(String[] args) {
        String octal = "765"; // because octal value can't be greater than 7

        int decimal = Integer.parseInt(octal, 8); //Octal convertion requires 8 bit.

        System.out.println(octal+" octal to decimal is -"+decimal);
    }
}