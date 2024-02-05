public class StringBufferClass {
    public static void main(String[] args) {
        // Create a StringBuffer with initial value "Raiyan"
        StringBuffer sb = new StringBuffer("Raiyan");

        // Append " Jiyon" to the StringBuffer
        sb.append(" Jiyon");
        System.out.println(sb);

        // Append "\nAge is : 24" to the StringBuffer
        sb.append("\nAge is : " + 24);
        System.out.println(sb);

        // Set the length of the StringBuffer to 5
        sb.setLength(5);
        System.out.println(sb);

        // Reverse the content of the StringBuffer
        sb.reverse();
        System.out.println(sb);

        // Delete characters from index 0 to 5 in the StringBuffer
        sb.delete(0, 5);
        System.out.println(sb);
    }
}
