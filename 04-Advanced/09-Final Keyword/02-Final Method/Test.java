class Person {
    // Final method in the Person class
    final void display1() {
        System.out.println("Person class method.");
    }
}

class Teacher extends Person {
    // Attempting to override the final method, which is not allowed
    // Error: display1() in Teacher cannot override display1() in Person
    // overridden method is final
    // void display1() {
    //     System.out.println("Teacher class method.");
    // }

    // Another method in the Teacher class
    void display2() {
        System.out.println("Teacher class method.");
    }
}

public class Test {
    public static void main(String[] args) {
        // Creating an instance of the Teacher class
        Teacher t1 = new Teacher();

        // Calling the final method from the superclass
        t1.display1();

        // Calling the method from the subclass
        t1.display2();
    }
}
