public class Part4 {
    public static void main(String[] args) {
        // Declare a string
        String s1 = "This is my country";
        System.out.println("Original String - " + s1);

        // Replace 'i' with 'h' in the string
        String s2 = s1.replace('i', 'h');
        System.out.println("Replace String - " + s2);

        // Split the string into an array using space as the delimiter
        String[] s3 = s1.split(" ");

        // Print each element of the split string array
        for (String string : s3) {
            System.out.println(string);
        }
    }
}
