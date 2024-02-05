/*
There are two types of String comperision.
1. equals()
2. operator

Main difference between and equals in Java is that is used to compare primitives while equals() method is recommended to check equality of objects.

*/

public class Test {
    public static void main(String[] args) {
        String password1 = "raiyan123";
        String password2 = "raiyan123";
        String password3 = new String("raiyan123");
        String password4 = new String("raiyan123");

        //equal()
        System.out.println(password1.equals(password2));
        System.out.println(password1.equals(password3));
        System.out.println(password3.equals(password4));
        
        System.out.println("\n\n");
        
        //operator (=)
        System.out.println(password1==password2);
        System.out.println(password1==password3);
        System.out.println(password3==password4);
    }
}
