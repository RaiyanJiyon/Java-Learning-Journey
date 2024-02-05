import java.util.ArrayList;

public class Part2 {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> number = new ArrayList<>();

        // Add elements to the ArrayList
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);

        // Print the ArrayList
        System.out.println(number);

        // Check if the ArrayList is empty
        boolean check = number.isEmpty();
        System.out.println("Is ArrayList Empty? " + check);

        // Check if the ArrayList contains a specific number (20)
        boolean numCheck = number.contains(20);
        System.out.println("Is number 20 in ArrayList? " + numCheck);

        // Find the index of a specific number (40)
        int pos = number.indexOf(40);
        System.out.println("Position of Index 40 is - " + pos);

        // Replace the value at index 0 with a new value (100)
        number.set(0, 100);
        System.out.println("New ArrayList - " + number);

        // Get the value at index 0
        int x = number.get(0);
        System.out.println("Value at index 0 is - " + x);
    }
}
