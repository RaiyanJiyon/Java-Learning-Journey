class Person {
    private int id;
    private String name;

    // Setter methods to set the values of private variables
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter methods to retrieve the values of private variables
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class Teacher extends Person {
    String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    void display() {
        System.out.println("ID - "+getId());
        System.out.println("Name - "+getName());
        System.out.println("Qualification - "+getQualification());
    }

    
}

public class Test {
    public static void main(String[] args) {
        // Creating an instance of the Teacher class
        Teacher t1 = new Teacher();

        // Using setter methods to set values
        t1.setId(221902113);
        t1.setName("MD. Raiyan Ur Rahman Jiyon");
        t1.setQualification("BSc in CSE");
        t1.display();

    }
}
