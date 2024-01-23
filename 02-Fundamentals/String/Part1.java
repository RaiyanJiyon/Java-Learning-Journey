package String;

public class Part1 {
    public static void main(String[] args) {
        String s1 = "Anisul Islam";
        String s2 = new String("Anisul Islam");

        System.out.println("S1 - "+s1);
        System.out.println("S2 - "+s2);

        //equalsIgnorecase ignore upper and lower case from string
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Equals");
        } else {
            System.out.println("Not Equal");
        }

        //contains method return true if given string is in compare string
        boolean check1 = s1.contains(s2);
        System.out.println(check1);
        boolean check2 = s1.contains("Anis");
        System.out.println(check2);
        boolean check3 = s1.contains("anis");
        System.out.println(check3);

        boolean result =  s1.isEmpty();
        System.out.println(result);

    }
    
}
