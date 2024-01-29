class Teacher {
    int id;
    String name;
    String gender;

    // Default Constructor
    public Teacher() {
        System.out.println("No Value.");
    }

    // One Parametrise Constructor
    public Teacher(int id) {
        this.id = id;
    }

    // Two Parametrise Constructor
    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Three Parametrise Constructor
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

    public class ConstructorOverloading {
        public static void main(String[] args) {
            Teacher t1 = new Teacher();
            t1.displayInformation();

            Teacher t2 = new Teacher(101);
            t2.displayInformation();

            Teacher t3 = new Teacher(102, "Harry");
            t3.displayInformation();

            Teacher t4 = new Teacher(101, "Anisul Islam", "Male");
            t4.displayInformation();
        }

    }
}
