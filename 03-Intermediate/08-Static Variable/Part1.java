class Student {
    String name; //instance variable
    int age; //instance variable
    static String university = "Green University"; //static or class variable

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInformation() {
        System.out.println("Name - "+name);
        System.out.println("Age - "+age);
        System.out.println("University - "+university);
        System.out.println("\n\n");
    }
}

public class Part1 {
    public static void main(String[] args) {
        Student s1 = new Student("Raiyan Jiyon", 24);
        s1.displayInformation();

        Student s2 = new Student("Sabbir Ahmed", 24);
        s2.displayInformation();

        Student s3 = new Student("Ishaq Ahmmad Mondal", 25);
        s3.displayInformation();
    }
    
}
