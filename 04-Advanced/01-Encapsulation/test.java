/*
 Encapsulation is a process of
 1. Packaging Variables and methods into a single unit.
 2. Protecting data by declaring them as private.
 */

 /*
  • How to do encapsulation ?
   1. Declare the variables as private.
   2. Provide public setter and getter method to modify and get the variables value.
  */


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
    
    // Other methods can also be defined to operate on the encapsulated data
    void display() {
        System.out.println("ID - " + id);
        System.out.println("Name - " + name);
    }
}

public class test {
    public static void main(String[] args) {
        // Creating an instance of the Person class
        Person p1 = new Person();

        // Using setter methods to set values
        p1.setId(221902113);
        p1.setName("MD. Raiyan Ur Rahman Jiyon");

        // Using the display method to print the encapsulated data
        p1.display();
    }
}
