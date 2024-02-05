// Importing the HashMap class from java.util package
import java.util.HashMap;

// Main class named Test
public class Test {
    // The main method
    public static void main(String[] args) {
        // Creating a HashMap with Integer keys and String values
        HashMap<Integer, String> customer = new HashMap<Integer, String>();

        // Adding data to the HashMap using put method
        customer.put(221, "Raiyan Jiyon");
        customer.put(222, "Sabbir Ahmed");
        customer.put(223, "Ishaq Ahammad");
        customer.put(224, "Tamim Zia");

        // Retrieving and printing data using get method
        System.out.println(customer.get(221));
        System.out.println(customer.get(222));
        System.out.println(customer.get(223));
        System.out.println(customer.get(224));
    }
}
