// Importing necessary packages
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

// Class to demonstrate working with dates
public class DateClass {
    public static void main(String[] args) {
        // Get the current time in milliseconds since the epoch
        long currentTimeMillis = System.currentTimeMillis();

        // Create a java.sql.Date object using the current time
        Date date = new Date(currentTimeMillis);

        // Print the current date and time using the default format
        System.out.println("Current Date and Time: " + date);

        // Create a date format for a specific pattern ("dd/MM/YYYY")
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");

        // Format the java.sql.Date object to a string with the specified pattern
        String currentDate = dateFormat.format(date);

        // Print the current date using the specified format
        System.out.println("Formatted Current Date: " + currentDate);
    }
}
