public class Part2 {
    public static void main(String[] args) {
        // Declare two strings
        String firstName = "Raiyan";
        String lastName = " Jiyon";

        // Concatenate the two strings
        String fullName = firstName.concat(lastName);
        System.out.println("Full Name - " + fullName);

        // Convert the first name to Uppercase
        String up = firstName.toUpperCase();
        System.out.println("Uppercase - " + up);

        // Convert the first name to Lowercase
        String low = firstName.toLowerCase();
        System.out.println("Lowercase - " + low);

        // Check if the first name starts with "Rai"
        boolean start = firstName.startsWith("Rai");
        System.out.println("Start with Rai? " + start);

        // Check if the last name ends with "ni"
        boolean end = lastName.endsWith("ni");
        System.out.println("End with ni? " + end);

        // Declare a string array
        String[] names = {"Raiyan", "Sabbir", "Tamim", "Ishaq", "Mahabub"};

        // Print each element of the string array
        for (String x : names) {
            System.out.println(x);
        }
    }
}
