/*
• What is exception handling?
-> The exception handling is one of the powerful mechanism to handle the runtime errors .

• Exception handling is managed by 5 keywords.
1. try
2. catch
3. finally
4. throw
5. throws
*/

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        try {
            // Prompt the user to enter the 1st integer number
            System.out.print("Enter 1st integer number: ");
            int num1 = input.nextInt();

            // Prompt the user to enter the 2nd integer number
            System.out.print("Enter 2nd integer number: ");
            int num2 = input.nextInt();

            // Perform division and store the result
            int result = num1 / num2;

        } catch (ArithmeticException e1) {
            // Handle ArithmeticException (division by zero)
            System.out.println("Arithmetic Exception: " + e1);
        } catch (ArrayIndexOutOfBoundsException e2) {
            // Handle ArrayIndexOutOfBoundsException
            System.out.println("Array Index Out of Bounds Exception: " + e2);
        } catch (NumberFormatException e3) {
            // Handle NumberFormatException (invalid input format)
            System.out.println("Number Format Exception: " + e3);
        } catch (Exception e) {
            // Handle other exceptions
            System.out.println("Exception: " + e);
        } finally {
            // Code in the finally block will always be executed
            System.out.println("Program End.");
        }
    }
}
