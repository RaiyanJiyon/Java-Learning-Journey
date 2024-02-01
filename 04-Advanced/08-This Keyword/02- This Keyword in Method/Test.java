class Person {
    // Method that prints a message
    void message() {
        System.out.println("I am message method.");
    }

    // Current class method
    void display() {
        // Call the message method from the same class using 'this'
        this.message();
        System.out.println("I am display method.");
    }
}

public class Test {
    public static void main(String[] args) {
        // Create an instance of the Person class
        Person p = new Person();

        // Call the display method, which in turn calls the message method
        p.display();
    }
}
