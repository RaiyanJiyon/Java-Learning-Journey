// Importing necessary packages
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

// Class to demonstrate working with time
public class TimeClass {
    public static void main(String[] args) {
        // Get the current local time
        LocalTime time = LocalTime.now();

        // Create a DateTimeFormatter with a specific time pattern ("hh:mm:ss")
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");

        // Format the LocalTime object to a string with the specified pattern
        String formattedTime = time.format(formatter);

        // Print the formatted time
        System.out.println(formattedTime);
    }
}
