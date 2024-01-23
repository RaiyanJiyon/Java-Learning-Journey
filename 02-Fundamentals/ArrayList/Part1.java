package ArrayList;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Part1 {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        //print the arraylist size
        System.out.println("Array Size - "+number.size());
        
        //adding value in arraylist
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3, 40);
        
        //print the arraylist
        System.out.println(number);
        

        //print the arraylist with iterator
        // Iterator itr = (Iterator) number.iterator();
        // while (itr.next()) {
            
        // }

        //print the arraylist with for each loop
        for (Integer x : number) {
            System.err.print(x+" ");
        }
        //print the arraylist size
        System.out.println("\nArray Size - "+number.size());

        //remove arraylist item

        number.remove(2);
        System.out.println("Remove index 2 item: ");
        System.out.println(number);
        
        number.removeAll(number);
        System.out.println("Remove all item: ");
        System.out.println(number);
        

    }
}