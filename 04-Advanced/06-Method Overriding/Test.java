/*
Question 1: what is Method overriding ?
 Declaring a method in subclass which is already present in superclass is known as Method Overriding.

Question 2: why do we need Method overriding ?
   1. Code reuse
   2. One interface, multiple implement
   3. Run time polymorphism
*/


/*

Question 3: what are the rules for Method overriding ?
  1. Name, signature type, parameter must be same.
  2. If a method can't be inherited, then it can't be overridden.
  3. A method declared as final or static can't be overridden.
  4. Constructor can't be overridden.

*/

class Person {
    String name;
    int age;

    void display() {
        System.out.println("Name - "+name);
        System.out.println("Age - "+age);
    }
}

class Teacher extends Person { //we can't override static or final method.
    String qualification;
    
    @Override
    void display() {
        System.out.println("Name - "+name);
        System.out.println("Age - "+age);
        System.out.println("Qualification - "+qualification);
    }
}

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.name = "Anisul Islam";
        p1.age = 33;
        p1.display();
        
        System.out.println("\n\n");
        
        Teacher t1 = new Teacher();
        
        t1.name = "Anisul Islam";
        t1.age = 33;
        t1.qualification = "BSc in CSE";
        t1.display();
    }
    
}
