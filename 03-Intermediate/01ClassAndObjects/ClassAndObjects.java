class Teacher {
    int id;
    String name;
    String gender;
}

public class ClassAndObjects {

    public static void main(String[] args) {
        
        // Creating an instance of the Teacher class
        Teacher t1 = new Teacher();
        t1.id = 221;
        t1.name = "Anisul Islam";
        t1.gender = "Male";

        // Printing the information
        System.out.println("Teacher ID - " + t1.id);
        System.out.println("Teacher Name - " + t1.name);
        System.out.println("Teacher Gender - " + t1.gender);
    }
}
