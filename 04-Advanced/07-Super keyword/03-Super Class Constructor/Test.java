// super class constructor.
class A {
    // Constructor for class A
    public A() {
        System.out.println("A's Constructor.");
    }
}

class B extends A {
    // Constructor for class B
    public B() {
        // Call the constructor of the superclass (A) using 'super'
        super();
        
        // Additional constructor code for class B
        System.out.println("B's Constructor.");
    }
}

public class Test {
    public static void main(String[] args) {
        // Creating an instance of the B class
        B b = new B();
    }
}
