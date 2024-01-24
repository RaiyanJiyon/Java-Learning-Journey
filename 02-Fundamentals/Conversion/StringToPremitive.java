package Conversion;

public class StringToPremitive {
    public static void main(String[] args) {
        String s1 = "123";
        System.out.println("Value of s1 String - "+s1);
        
        int i1 = Integer.parseInt(s1);
        System.out.println("Value of i1 Integer - "+i1);

        //we can use Valueof() method instead of parseInt() also.

    }
    
}
