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

public class Test {
    public static void main(String[] args) {
        // Creating an instance of the Person class
        Person p1 = new Person();

        // Using setter methods to set values
        p1.setId(221902113);
        p1.setName("MD. Raiyan Ur Rahman Jiyon");

        System.out.println("ID - "+p1.getId());
        System.out.println("Name - "+p1.getName());
    }
}
