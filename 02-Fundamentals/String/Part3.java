package String;

import java.sql.Struct;

public class Part3 {
    public static void main(String[] args) {
        String country = "Bangladesh is a beautiful Country";
        System.out.println(country);

        //charAt method returs given index value
        char a = country.charAt(0);
        System.out.println(country+ "- first index character is - "+a);

        //codePointAt method returs given index character asciii value
        int ascii = country.codePointAt(3);
        System.out.println("g ascii value is - "+ascii);

        //indexOf methods search the given value from the beggening and return the index number.
        int pos = country.indexOf('l');
        System.out.println(pos);

        //lastIndexOf methods search the given value from the end and return the index number.
        int pos2 = country.lastIndexOf('o');
        System.out.println(pos2);

        String country2 = "  Japan is an asian   country  ";
        System.out.println(country2);
        //trim() method delete any string beggining and ending space.
        String trim = country2.trim();
        System.out.println("Using Trim method - "+trim);
    }
    
}
