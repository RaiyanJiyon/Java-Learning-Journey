class Teacher {
    int id;
    String name;
    String gender;

    //Default Constructor
    public Teacher() {
        System.out.println("No Value.");
    }

    //Parametrise Constructor
    public Teacher(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    void displayInformation() {
        System.out.println("ID - " + id);
        System.out.println("Name - " + name);
        System.out.println("Gender - " + gender);
        System.out.println("\n\n");
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        Teacher t1 = new Teacher(101, "Anisul Islam", "Male");
        t1.displayInformation();

        Teacher t2 = new Teacher(102, "Harry", "Male");
        t2.displayInformation();

        Teacher t3 = new Teacher();
        t3.displayInformation();
    }

}
