class Teacher {
    int id;
    String name;
    String gender;

    void DisplayInformation() {

        // Printing the information
        System.out.println("Teacher ID - " +id);
        System.out.println("Teacher Name - " +name);
        System.out.println("Teacher Gender - " +gender);

    }
}

public class ClassAndObject {

    public static void main(String[] args) {

        // Creating an instance of the Teacher class
        Teacher t1 = new Teacher();
        t1.id = 221;
        t1.name = "Anisul Islam";
        t1.gender = "Male";

        //calling DisplayInformation method
        t1.DisplayInformation();
    }
}
