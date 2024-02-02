// Superclass representing a Person
class Person {
    // Method to display a message in the superclass
    void display() {
        System.out.println("Super Class.");
    }
}

// Subclass Teacher extending the Person class
class Teacher extends Person {
    // Override the display method in the subclass
    @Override
    void display() {
        System.out.println("Sub Class.");
    }
}

// Main class for testing
public class Test {
    public static void main(String[] args) {
        // Upcasting: Creating an object of the subclass using a reference of the superclass
        Person p = new Teacher();
        
        // Call the display method. The actual implementation is determined at runtime.
        p.display(); 

        // Downcasting: Attempting to create an object of the superclass using a reference of the subclass
        // This will throw a ClassCastException at runtime, as Teacher cannot be cast to Person.
        Teacher t = (Teacher) new Person();
        
        // Attempt to call the display method on the downcasted object (runtime error)
        t.display(); // This line will throw a runtime error.
    }
}
