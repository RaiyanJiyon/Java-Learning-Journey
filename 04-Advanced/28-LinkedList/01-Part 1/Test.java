// Importing the LinkedList class from java.util package
import java.util.LinkedList;

// Main class named Test
public class Test {
    // The main method
    public static void main(String[] args) {
        // Creating a LinkedList of Strings named countryName
        LinkedList<String> countryName = new LinkedList<>();
        
        // Adding countries to the LinkedList
        countryName.add("Bangladesh");
        countryName.add("India");
        countryName.add("Pakistan");
        countryName.add("Afghanistan");

        // Iterating through the LinkedList and printing each country
        for (String string : countryName) {
            System.out.println(string);
        }
    }
}
