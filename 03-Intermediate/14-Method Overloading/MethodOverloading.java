/*
 Method Overloading is a process that allows a class to have two or more methods having same name, as long as their parameter declarations are different.

 These methods are called overloaded method.
 */

class Overloading {
    void add(int a, int b) {
        System.out.println(a+b);
    }

    void add(double a, double b) {
        System.out.println(a+b);
    }
    void add(int a, int b, int c) {
        System.out.println(a+b+c);
    }
    void add(int a, double b) {
        System.out.println(a+b);
    }

    void add() {
        System.out.println("Nothing to Add.");
    }
}

public class MethodOverloading {
    public static void main(String[] args) {

        Overloading ob1 = new Overloading();
        ob1.add(10, 20);
        ob1.add(10.10, 20.03);
        ob1.add(10, 0, 20);
        ob1.add(100, 20.22);
        ob1.add();
        
    }
    
}
