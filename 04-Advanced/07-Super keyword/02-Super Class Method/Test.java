// super class method.
class A {
    void display() {
        System.out.println("Display Method from A Class.");
    }
}

class B extends A {
    // Override the display method in the subclass (B)
    void display() {
        // Call the display method from the superclass (A) using 'super'
        super.display();
        
        // Add additional functionality specific to the subclass (B)
        System.out.println("Display Method from B Class.");
    }
}

public class Test {
    public static void main(String[] args) {
        // Creating an instance of the B class
        B b = new B();

        // Calling the overridden display method in the B class
        b.display();
    }
}
