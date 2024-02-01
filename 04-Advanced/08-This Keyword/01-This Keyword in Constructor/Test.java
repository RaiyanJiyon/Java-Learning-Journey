/*

"this" keyword used to refer current class object.


• Usages of "this" keyword :
1. Refer current class instance variable.
2. It can be used to call current class constructor.
3. It can be used to call current class method.
4. It can be passed as an argument in the method. (event handling)

*/


class Person {
    String name;
    int age;
    String hairColor;

    //class instance variable 'this' clas
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //current class constructor 'this' class
    public Person(String name, int age, String hairColor) {
        this(name, age);
        this.hairColor = hairColor;
    }

    void display() {
        System.out.println("Name - " + name);
        System.out.println("Age - " + age);
        System.out.println("Hair Color - " + hairColor);
    }
}

public class Test {
    public static void main(String[] args) {
        // Create an instance of Person with name "Rijve Khan", age 24
        Person p1 = new Person("Rijve Khan", 24);
        p1.display();

        System.out.println("\n\n");

        // Create another instance of Person with name "Rajib Khan", age 23, and hair color "Black"
        Person p2 = new Person("Rajib Khan", 23, "Black");
        p2.display();
    }
}
