// Define interface A
interface A {
    void message();
}

// Define interface B
interface B {
    void message();
}

// Implement interfaces A and B in class C
class C implements A, B {
    @Override
    public void message() {
        System.out.println("This is how Interface Supports Multiple Inheritance.");
    }
}

// Main class for testing
public class Test {
    public static void main(String[] args) {
        // Create an object of class C
        C c = new C();

        // Call the message method, which is inherited from both interfaces A and B
        c.message();
    }
}
