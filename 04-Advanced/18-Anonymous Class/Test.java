// Superclass representing a Person
class Person {
    // Method to display a message in the superclass
    void display() {
        System.out.println("Person Class.");
    }
}

// Main class for testing
public class Test {
    public static void main(String[] args) {
        // Creating an anonymous subclass of the Person class
        Person p = new Person() {
            // Override the display method in the anonymous subclass
            @Override
            void display() {
                System.out.println("Test Class.");
            }
        };

        // Call the display method. The overridden implementation in the anonymous subclass is executed.
        p.display();
    }
}
