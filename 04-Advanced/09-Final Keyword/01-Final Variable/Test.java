/*
Using final keyword will restrict the user.
1) final variable
2) final method
3) final class
*/

class Student {
    // 1) Final variable
    final String UNIVERSITY_NAME = "Green University";

    // 2) Blank final instance variable (initialized in the constructor)
    final String DEPARTMENT;

    // 3)  static blank final variable (initialized in a static block)
    static final String COURSE;

    // Constructor to initialize the blank final instance variable
    public Student() {
        DEPARTMENT = "CSE";
    }

    // Static blank block to initialize the final static variable
    static {
        COURSE = "Object Oriented Programming";
    }

    // Method to display information
    void display() {
        System.out.println("University Name - " + UNIVERSITY_NAME);
        System.out.println("Department Name - " + DEPARTMENT);
        System.out.println("Course Name - " + COURSE);
    }
}

public class Test {
    public static void main(String[] args) {
        // Creating an instance of the Student class
        Student s1 = new Student();

        // Calling the display method to see the information
        s1.display();
    }
}
