public class Part3 {
    public static void main(String[] args) {
        // Declare a string
        String country = "Bangladesh is a beautiful Country";
        System.out.println(country);

        // Get the character at the first index
        char a = country.charAt(0);
        System.out.println(country + "- first index character is - " + a);

        // Get the ASCII value of the character at index 3
        int ascii = country.codePointAt(3);
        System.out.println("g ASCII value is - " + ascii);

        // Find the index of the character 'l'
        int pos = country.indexOf('l');
        System.out.println("Index of 'l': " + pos);

        // Find the last index of the character 'o'
        int pos2 = country.lastIndexOf('o');
        System.out.println("Last Index of 'o': " + pos2);

        // Declare another string with leading and trailing spaces
        String country2 = "  Japan is an asian   country  ";
        System.out.println(country2);

        // Remove leading and trailing spaces using trim()
        String trim = country2.trim();
        System.out.println("Using Trim method - " + trim);
    }
}
