package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortingArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        number.add(10);
        number.add(-10);
        number.add(-1);
        number.add(100);
        number.add(50);
        number.add(11);

        System.out.println("Arraylist - "+number);

        Collections.sort(number);
        System.out.println("Arraylist with Ascending sort - "+number);
        
        Collections.sort(number, Collections.reverseOrder());
        System.out.println("Arraylist with Descending sort - "+number);

    }
}
