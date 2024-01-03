package BitwiseOperator;

public class BitwiseOperator {
    public static void main(String[] args) {
        // Bitwise operators work first with binary numbers 
        // then convert binary results into decimal numbers 

        int a = 32;
        int b = 12;

        // Bitwise AND 
        // Sets each bit to 1 if both bits are 1
        System.err.println("Bitwise AND: " + (a & b));

        // Bitwise OR 
        // Sets each bit to 1 if at least one of the bits is 1
        System.err.println("Bitwise OR: " + (a | b));

        // Bitwise EXOR 
        // Sets each bit to 1 if only one of the bits is 1
        System.err.println("Bitwise EXOR: " + (a ^ b));

        // Bitwise Right Shift 
        // Right shift 'a' by 3 positions (equivalent to dividing 'a' by 2^3)
        int c = a >> 3;
        System.err.println("Bitwise Right Shift: " + c);
        
        // Bitwise Left Shift 
        // Left shift 'a' by 3 positions (equivalent to multiplying 'a' by 2^3)
        c = a << 3;
        System.err.println("Bitwise Left Shift: " + c);
    }
}
