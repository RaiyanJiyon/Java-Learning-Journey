package UserInput;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.print("Enter Your Name: ");
        String Name = input.nextLine();

        System.out.print("Enter Your Age: ");
        int Age = input.nextInt();

        System.err.println("User Name - "+Name);
        System.err.println("User Age - "+Age);
    }
}
