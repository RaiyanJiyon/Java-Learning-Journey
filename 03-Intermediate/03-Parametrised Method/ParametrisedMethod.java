class Teacher {
    int id;
    String name;
    String gender;

    void setInformation(int i, String n, String g) {
        id = i;
        name = n;
        gender = g;
    }

    void displayInformation() {
        System.out.println("ID - "+id);
        System.out.println("Name - "+name);
        System.out.println("Gender - "+gender);
    } 
}


public class ParametrisedMethod {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setInformation(221, "Anisul Islam", "Male");
        t1.displayInformation();

        Teacher t2 = new Teacher();
        t2.setInformation(222, "Harry", "Male");
        t2.displayInformation();
    }

    
}
