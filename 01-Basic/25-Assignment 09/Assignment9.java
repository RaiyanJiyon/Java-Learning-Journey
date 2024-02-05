// switch assignment: call center
// if user select option 1 then set language bengali
// if user select option 2 then set language hindi
// if user select option 3 then set language urdu
// for any other option set language english

// get the OPTION from user
// use switch, case, break and default

// Selected language is Bengali
// Selected language is Hindi
// Selected language is Urdu
// Selected language is English

import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Display language options to the user
        System.out.println("Select an option: ");
        System.out.println("1. Bengali");
        System.out.println("2. Hindi");
        System.out.println("3. Urdu");

        // User input for language selection
        int option = input.nextInt();

        // Variable to store the selected language
        String selectedLanguage;

        // Switch statement to determine the selected language based on the user's input
        switch (option) {
            case 1:
                selectedLanguage = "Bengali";
                break;

            case 2:
                selectedLanguage = "Hindi";
                break;

            case 3:
                selectedLanguage = "Urdu";
                break;

            default:
                selectedLanguage = "English"; // Default language if the user enters an invalid option
                break;
        }

        // Print the selected language
        System.out.println("Selected language is " + selectedLanguage);
    }
}
