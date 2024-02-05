// Class representing a Person
class Person {
    String name; // Name of the person
    int age;     // Age of the person

    // Override toString method to provide a string representation of the object
    public String toString() {
        return "Name - " + name + "\nAge - " + age;
    }
}

// Test class to demonstrate the usage of the Person class
public class Test {
    public static void main(String[] args) {
        // Creating an instance of Person for Raiyan
        Person p1 = new Person();
        p1.name = "Raiyan";
        p1.age = 24;

        // Creating an instance of Person for Akash
        Person p2 = new Person();
        p2.name = "Akash";
        p2.age = 23;

        // Printing the string representation of each person using the toString method
        System.out.println(p1); // toString method is implicitly called here
        System.out.println(p2);
    }
}
