/*
 Method Overloading is a process that allows a class to have two or more methods having same name, as long as their parameter declarations are different.

 These methods are called overloaded method.
 */

 class Overloading {

    void add(double a, double b) {
        System.out.println(a+b);
    }
    void add(int a, int b, int c) {
        System.out.println(a+b+c);
    }

    void add() {
        System.out.println("Nothing to Add.");
    }
}

public class AutomaticTypeConversion {
    public static void main(String[] args) {

        Overloading ob1 = new Overloading();
        //there is no add method where two integer parameter can go throw. so in that case Automatic Type conversion will work and it will matching two paremeter method and will send this parameter to that method.
        ob1.add(10, 20);
        ob1.add(10, 0, 20);
        ob1.add();
        
    }
    
}
