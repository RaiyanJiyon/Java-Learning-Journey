// Importing the HashSet class from java.util package
import java.util.HashSet;

// Main class named Test
public class Test {
    // The main method
    public static void main(String[] args) {
        // Creating a HashSet of Strings named fruits
        // HashSet doesn't contain duplicate values
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Jackfruit");

        // Uncomment the following line to demonstrate removal of an element
        // fruits.remove("Apple");

        // Printing the size of the HashSet
        System.out.println(fruits.size());

        // Iterating through the HashSet and printing each fruit
        for (String string : fruits) {
            System.out.println(string);
        }

        // Checking if the HashSet is empty and printing the result
        boolean isEmpty = fruits.isEmpty();
        System.out.println("Is the set empty? " + isEmpty);
    }
}
