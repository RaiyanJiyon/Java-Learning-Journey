import java.util.Scanner;

public class SmallBig {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a character
        System.out.print("Enter any Character: ");
        
        // Read the first character entered by the user
        char character = input.next().charAt(0);

        // Check if the entered character is a small letter
        if (character >= 'a' && character <= 'z') {
            System.out.println("Small Letter.");
        } 
        // Check if the entered character is a big letter
        else if (character >= 'A' && character <= 'Z') {
            System.out.println("Big Letter.");
        } 
        // If the entered character is not a letter
        else {
            System.out.println("Not a Character.");
        }
    }
}
