package ArrayList;

import java.util.ArrayList;

public class Part1 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        
        //adding elements

        num.add(10);
        num.add(20);
        num.add(30);
        num.add(3, 40);

        System.out.println("Size: "+num.size());
        // System.out.println(num);

        for (Integer x : num) {
            System.out.print(x+" ");
        }
    }
    
}
