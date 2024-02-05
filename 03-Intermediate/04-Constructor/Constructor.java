class Teacher {
    int id;
    String name;
    String gender;

    
    public Teacher(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }


    void displayInformation() {
        System.out.println("ID - "+id);
        System.out.println("Name - "+name);
        System.out.println("Gender - "+gender);
    } 
}


public class Constructor {
    public static void main(String[] args) {
        Teacher t1 = new Teacher(101, "Anisul Islam", "Male");
        t1.displayInformation();

        Teacher t2 = new Teacher(102, "Harry", "Male");
        t2.displayInformation();
    }
    
}
