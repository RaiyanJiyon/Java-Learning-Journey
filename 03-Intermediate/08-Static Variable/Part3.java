class Student {
    // Static variable to keep track of the total number of students
    static int count = 0;

    // Default constructor increments the count when a new student object is created
    Student() {
        count++;
    }

    // Method to display the total number of students
    void studentCount() {
        System.out.println("Total Student - " + count);
    }
}

public class Part3 {
    public static void main(String[] args) {
    
        Student s1 = new Student();        
        s1.studentCount();

        Student s2 = new Student();
        s2.studentCount();

        Student s3 = new Student();
        s3.studentCount();
    }
}
