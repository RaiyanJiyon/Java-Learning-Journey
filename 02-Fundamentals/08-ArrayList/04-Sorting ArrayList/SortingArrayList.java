import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> number = new ArrayList<>();

        // Add elements to the ArrayList
        number.add(10);
        number.add(-10);
        number.add(-1);
        number.add(100);
        number.add(50);
        number.add(11);

        System.out.println("ArrayList - " + number);

        // Sort the ArrayList in ascending order
        Collections.sort(number);
        System.out.println("ArrayList with Ascending sort - " + number);

        // Sort the ArrayList in descending order
        Collections.sort(number, Collections.reverseOrder());
        System.out.println("ArrayList with Descending sort - " + number);
    }
}
