// Importing the LinkedList class from java.util package
import java.util.LinkedList;

// Student class to represent a student
class Student {
    // Instance variables
    int id;
    String name;

    // Static variables shared by all instances
    static String semester = "sixth";
    static String universityName = "Green University";

    // Constructor to initialize id and name
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

// Main class named Test
public class Test {
    // The main method
    public static void main(String[] args) {
        // Creating a LinkedList of Student objects
        LinkedList<Student> list = new LinkedList<Student>();

        // Creating instances of Student
        Student s1 = new Student(221902113, "Raiyan Jiyon");
        Student s2 = new Student(221902129, "Sabbir Ahmed");
        Student s3 = new Student(221902133, "Ishaq Ahaammad");
        Student s4 = new Student(221902171, "Tamim Zia");

        // Adding students to the LinkedList
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        // Iterating through the LinkedList and printing student details
        for (Student student : list) {
            System.out.println(student.id + " " + student.name + " " + student.semester + " " + student.universityName);
        }
    }
}
