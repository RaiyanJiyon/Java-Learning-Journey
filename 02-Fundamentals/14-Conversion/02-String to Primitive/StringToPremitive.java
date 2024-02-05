public class StringToPremitive {
    public static void main(String[] args) {
        // Convert String to int
        String s1 = "123";
        System.out.println("Value of s1 String - " + s1);

        int i1 = Integer.parseInt(s1);
        System.out.println("Value of i1 Integer - " + i1);

        // We can use valueOf() method instead of parseInt() also.
        // int i1 = Integer.valueOf(s1);
        // System.out.println("Value of i1 Integer - " + i1);
    }
}
