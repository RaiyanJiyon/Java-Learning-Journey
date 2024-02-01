/*
What is inheritance ?
 Inheritance can be defined as the process where one class
 acquires the properties (methods and fields) of another.

Why do we need inheritance ?
1. For code Reusability
2. For method overriding
3. To implement parent-child relationship.
 */

class Person {
    String name;
    int age;

    void display1() {
        System.out.println("Name - "+name);
        System.out.println("Age - "+age);
    }
}

class Teacher extends Person {
    String Education;
    
    void display2() {
        display1();
        System.out.println("Education - "+Education);
    }
}

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.name = "Raiyan Jiyon";
        p1.age = 24;
        p1.display1();


        Teacher t1 = new Teacher();

        t1.name = "Anisul Islam";
        t1.age = 31;
        t1.Education = "BSc In CSE";

        t1.display1();
        t1.display2();
    }
    
}
