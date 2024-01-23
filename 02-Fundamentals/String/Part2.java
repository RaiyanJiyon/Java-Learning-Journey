package String;

public class Part2 {
    public static void main(String[] args) {
        String firstName = "Raiyan";
        String lastName = " Jiyon";

        //concat method add two string
        String fullName = firstName.concat(lastName);
        System.out.println("Full Name - "+fullName);

        //toUppercase method convert a string into Uppercase
        String up = firstName.toUpperCase();
        System.out.println("Uppercase - "+up);
        
        //toLowercase method convert a string into Lowercase
        String low = firstName.toLowerCase();
        System.out.println("Lowercase - "+low);
        
        //startWith method checks if given string is start with from a string or not.
        boolean start = firstName.startsWith("Rai");
        System.out.println("Start with Rai? "+start);
        
        //endsWith method checks if given string is ends with from a string or not.
        boolean end = lastName.endsWith("ni");
        System.out.println("End with ni? "+end);

        //string array declare
        String[] names = {"Raiyan", "Sabbir", "Tamim", "Ishaq", "Mahabub"};

        //printing a string array
        for (String x : names) {
            System.out.println(x);
        }
    }
    
}
