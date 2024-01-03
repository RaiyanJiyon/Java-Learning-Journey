// Logical or assignment
// step 1: Print "Do you love java? "
// step 2: take user input y / Y / n / N
// step 3: if user input y / Y then print you are a java lover
// step 4: if user input n / N then print you are not a java lover

package Assignment7;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        System.out.println("Do You Love Java? ");
        System.out.println("Enter y/Y for Yes Or, Enter n/N for No: ");
        Scanner input = new Scanner(System.in);
        char choice = input.next().charAt(0);

        if (choice == 'y' || choice == 'Y') {
            System.out.println("You Are A Java Lover.");
        } else if (choice == 'n' || choice == 'N') {
            System.out.println("You Are Not A Java Lover.");
        } else {
            System.out.println("Not A Valid Input.");
        }

    }
}
