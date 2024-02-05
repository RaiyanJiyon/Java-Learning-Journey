public class StringBuilderClass {
    public static void main(String[] args) {
        // Create a StringBuilder with initial value "Raiyan"
        StringBuilder sb = new StringBuilder("Raiyan");

        // Append " Jiyon" to the StringBuilder
        sb.append(" Jiyon");
        System.err.println(sb);

        // Reverse the content of the StringBuilder
        sb.reverse();

        // Append "\nAge is - 24" to the StringBuilder
        sb.append("\nAge is - " + 24);
        System.out.println(sb);

        // Delete characters from index 0 to 5 in the StringBuilder
        sb.delete(0, 5);
        System.out.println(sb);
    }
}
