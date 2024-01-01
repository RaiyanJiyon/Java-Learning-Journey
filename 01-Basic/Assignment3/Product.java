/*
 * Assignment-3 (User Input)
 * step 1: create a class called Product
 * step 2: create a main method
 * step 3: declare variables: id, title, price, description, category
 * step 4: get user input for each variables
* step 5: print the variables
 */

package Assignment3;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.err.print("Enter ID: ");
        int id = input.nextInt();
        input.nextLine(); // Consume the newline character

        System.err.print("Enter Title: ");
        String title = input.nextLine();

        System.err.print("Enter Price: ");
        double price = input.nextDouble();
        input.nextLine(); // Consume the newline character

        System.err.print("Enter Description: ");
        String description = input.nextLine();

        System.err.print("Enter Category: ");
        String category = input.nextLine();

        System.out.println("Id - " + id);
        System.out.println("Title - " + title);
        System.out.println("Price - " + price);
        System.out.println("Description - " + description);
        System.out.println("Category - " + category);
    }
}
