package StringPalindrome;

public class StringPalindrome {
    public static void main(String[] args) {
        String originalString = "madam";
        StringBuffer sb = new StringBuffer(originalString);
        String reversedString = sb.reverse().toString();

        if (originalString.equals(reversedString)) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a Palindrome String.");
        }
    }
}
