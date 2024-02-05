public class Part1 {
    public static void main(String[] args) {
        // Create two strings using different approaches
        String s1 = "Anisul Islam";
        String s2 = new String("Anisul Islam");

        // Print the strings
        System.out.println("S1 - " + s1);
        System.out.println("S2 - " + s2);

        // Compare the strings ignoring case
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Equals");
        } else {
            System.out.println("Not Equal");
        }

        // Check if s1 contains s2
        boolean check1 = s1.contains(s2);
        System.out.println(check1);

        // Check if s1 contains the substring "Anis"
        boolean check2 = s1.contains("Anis");
        System.out.println(check2);

        // Check if s1 contains the substring "anis" (case-sensitive)
        boolean check3 = s1.contains("anis");
        System.out.println(check3);

        // Check if s1 is empty
        boolean result = s1.isEmpty();
        System.out.println(result);
    }
}
