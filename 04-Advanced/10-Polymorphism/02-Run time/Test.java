// 2. Run time Polymorphism => Method overriding

class Person {
    String name;
    int age;

    void display() {
        System.out.println("Name - " + name);
        System.out.println("Age - " + age);
    }
}

class Teacher extends Person {
    String qualification;

    @Override
    void display() {
        System.out.println("Name - " + name);
        System.out.println("Age - " + age);
        System.out.println("Qualification - " + qualification);
    }
}

public class Test {
    public static void main(String[] args) {
        Person p = new Teacher(); //This is called Dynamic method dispatch

        p.name = "John"; // Setting values for demonstration
        p.age = 30;
        // p.qualification = "Ph.D."; // This line is not allowed because the reference is of type Person

        p.display(); // Calls the display method overridden in the Teacher class
    }
}
