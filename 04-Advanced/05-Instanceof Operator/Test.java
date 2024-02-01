class Person {
    String name;
    int age;
}

class Teacher extends Person {
    String qualification;
}

class Student extends Teacher {
    String subject;
}

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();
        Teacher t1 = new Teacher();
        Student s1 = new Student();
        
        System.out.println(p1 instanceof Person);
        System.out.println(t1 instanceof Teacher);
        System.out.println(s1 instanceof Student);

        System.out.println("\n\n");

        System.out.println(p1 instanceof Teacher); //False
        System.out.println(t1 instanceof Person); //True
        System.out.println(t1 instanceof Student); //False
        System.out.println(s1 instanceof Teacher); //True
    }
    
}
