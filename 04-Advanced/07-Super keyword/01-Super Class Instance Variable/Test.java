/*
"super" keyword is used to refer to the immediate superclass object.

• Usage of super keyword:

1. It is used to call the super class instance variable.
2. It is used to call the super class method (overridden method).
3. It is used to call the super class constructor.
*/



// super class instance variable.
class A {
    int x = 10;
}

class B extends A {
    int x = 5;

    void display() {
        // Display the value of 'x' from the B class
        System.out.println("X Value from B class - " + x);

        // Using the super keyword to access the 'x' variable from the immediate superclass (A class)
        System.out.println("X Value from A class - " + super.x);
    }
}

public class Test {
    public static void main(String[] args) {
        // Creating an instance of the B class
        B b = new B();

        // Calling the display method to see the usage of the 'super' keyword
        b.display();
    }
}
