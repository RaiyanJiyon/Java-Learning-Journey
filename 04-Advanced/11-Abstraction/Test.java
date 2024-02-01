// Abstract class with an abstract method
abstract class Mobileuser {
    abstract void message();

    void display() {
        System.out.println("This is normal method.");
    }
}

// Concrete class extending Mobileuser and implementing the abstract method
class Raihan extends Mobileuser {
    @Override
    void message() {
        System.out.println("Hello, I am Raihan.");
    }
}

// Another concrete class extending Mobileuser and implementing the abstract method
class Tamim extends Mobileuser {
    @Override
    void message() {
        System.out.println("Hello, I am Tamim.");
    }
}

// Main class to test abstract classes and polymorphism
public class Test {
    public static void main(String[] args) {
        // Reference variable of type Mobileuser
        Mobileuser raihanUser = new Raihan();
        Mobileuser tamimUser = new Tamim();

        // Calling the overridden message method for Raihan
        raihanUser.message();

        // Calling the overridden message method for Tamim
        tamimUser.message();
    }
}
