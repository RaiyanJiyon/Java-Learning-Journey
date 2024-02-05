public class StringPalindrome {
    public static void main(String[] args) {
        // Specify the original string
        String originalString = "madam";

        // Create a StringBuffer and reverse the original string
        StringBuffer sb = new StringBuffer(originalString);
        String reversedString = sb.reverse().toString();

        // Check if the original string is equal to the reversed string
        if (originalString.equals(reversedString)) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a Palindrome String.");
        }
    }
}
