import java.util.ArrayList;

public class Part3 {
    public static void main(String[] args) {
        // Create three ArrayLists of integers
        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();

        // Add elements to the first ArrayList
        number1.add(10);
        number1.add(20);
        number1.add(30);
        number1.add(40);
        System.out.println("ArrayList 1 - " + number1);

        // Add elements to the second ArrayList
        number2.add(100);
        number2.add(200);
        number2.add(300);
        number2.add(400);
        System.out.println("ArrayList 2 - " + number2);

        // Copy elements from the first ArrayList to the third one
        number3.addAll(number1);
        System.out.println("ArrayList 3 - " + number3);

        // Check if ArrayList 1 is equal to ArrayList 2
        boolean result1 = number1.equals(number2);
        System.out.println("ArrayList 1 == ArrayList 2? " + result1);

        // Check if ArrayList 1 is equal to ArrayList 3
        boolean result2 = number1.equals(number3);
        System.out.println("ArrayList 1 == ArrayList 3? " + result2);
    }
}
