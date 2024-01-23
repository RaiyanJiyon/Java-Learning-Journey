package ArrayList;

import java.util.ArrayList;

public class Part2 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);

        //printing arraylist
        System.out.println(number);

        // number.clear();
        // System.out.println("After using clear method, Arraylist contains - "+number);

        boolean check = number.isEmpty();
        System.out.println("Is Arraylist is Empty? "+check);

        boolean numcheck = number.contains(20);
        System.out.println("Is number 20 is in Arraylist? "+numcheck);

        int pos = number.indexOf(40);
        System.out.println("Position of Index 40 is - "+pos);

        //set method replace given index value.
        number.set(0, 100);
        System.out.println("New Arraylist - "+number);

        //get method
        int x = number.get(0);
        System.out.println("Get index 0 value is - "+x);
    }
}
