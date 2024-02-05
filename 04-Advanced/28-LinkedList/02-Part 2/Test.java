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

        // Inserting "Nepal" at index 4
        countryName.add(4, "Nepal");

        // Adding "Australia" at the beginning of the LinkedList
        countryName.addFirst("Australia");

        // Adding "England" at the end of the LinkedList
        countryName.addLast("England");

        // Uncomment the following lines to demonstrate removal operations
        // countryName.remove(3); 
        // countryName.removeFirst();
        // countryName.removeLast();

        // Printing the size of the LinkedList
        System.out.println("Size of Linkedlist: " + countryName.size());

        // Iterating through the LinkedList and printing each country
        for (String string : countryName) {
            System.out.println(string);
        }

        // Clearing the LinkedList
        countryName.clear();

        // Printing the empty LinkedList
        System.out.println(countryName);
    }
}
