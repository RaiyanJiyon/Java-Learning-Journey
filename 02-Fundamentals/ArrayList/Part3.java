package ArrayList;

import java.util.ArrayList;

public class Part3 {
    public static void main(String[] args) {
        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();

        number1.add(10);
        number1.add(20);
        number1.add(30);
        number1.add(40);
        System.out.println("Arraylist 1 - "+number1);
        
        number2.add(100);
        number2.add(200);
        number2.add(300);
        number2.add(400);
        System.out.println("Arraylist 2 - "+number2);
        
        
        number3.addAll(number1);
        System.out.println("Arraylist 3 - "+number3);

        boolean result1 = number1.equals(number2);
        System.out.println("Number1 == Number2? "+result1);

        boolean result2 = number1.equals(number3);
        System.out.println("Number1 == Number3? "+result2);

    }
    
}
