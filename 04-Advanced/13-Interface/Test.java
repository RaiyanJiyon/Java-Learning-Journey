/*
• What is an Interface?
• An interface is a collection of abstract methods.

• Why do we need an Interface ?
1. For fully abstraction.
2. It supports multiple inheritance.

*/

// Define an interface named Animal
interface Animal {
    int age = 10; // automatically compiler composes it as a static final variable.

    void sound(); // automatically compiler composes it as an abstract method.
}

// Implement the Animal interface in the Dog class
class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Bark Bark..!"); // Dog's sound implementation
    }
}

// Implement the Animal interface in the Cat class
class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Meow Meow..!"); // Cat's sound implementation
    }
}

// Main class for testing
public class Test {
    public static void main(String[] args) {
        // Animal a = new Animal(); // we can't create an interface class object

        Dog d = new Dog(); // Create an object of Dog
        d.sound(); // Call Dog's sound method

        Cat c = new Cat(); // Create an object of Cat
        c.sound(); // Call Cat's sound method
    }
}
