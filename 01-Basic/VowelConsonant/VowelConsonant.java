import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Alphabet: ");

        // Read the input as a string
        String inputString = input.next();

        // Check if the input is a single character
        if (inputString.length() == 1) {
            char alphabet = inputString.charAt(0);

            // Check if the character is a vowel or consonant
            if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u' ||
                alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("Please enter a single alphabet character.");
        }

        input.close();
    }
}
