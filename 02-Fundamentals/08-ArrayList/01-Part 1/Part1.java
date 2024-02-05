import java.util.ArrayList;
import java.util.Iterator; // Correct import statement

public class Part1 {

    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> number = new ArrayList<>();

        // Print the ArrayList size
        System.out.println("Array Size - " + number.size());

        // Add values to the ArrayList
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3, 40);

        // Print the ArrayList using toString method
        System.out.println(number);

        // Print the ArrayList using a for-each loop
        for (Integer x : number) {
            System.err.print(x + " ");
        }

        // Print the ArrayList size after adding elements
        System.out.println("\nArray Size - " + number.size());

        // Remove an item at index 2
        number.remove(2);
        System.out.println("Remove index 2 item: ");
        System.out.println(number);

        // Remove all items from the ArrayList
        number.removeAll(number);
        System.out.println("Remove all items: ");
        System.out.println(number);
    }
}
