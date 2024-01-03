package SmallBig;

import java.util.Scanner;

public class SmallBig {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Character: ");
        char character = input.next().charAt(0);

        if (character >= 'a' && character <= 'z') {
            System.out.println("Small Letter.");
        } else if (character >= 'A' && character <= 'Z') {
            System.out.println("Big Letter.");
        } else {
            System.out.println("Not a Character.");
        }
    }
    
}
