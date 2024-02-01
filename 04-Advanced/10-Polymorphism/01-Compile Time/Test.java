/*
Polymorphism is a mechanism where a
parent class reference variable can take
many forms (It can refer object from
different classes. )

Polymorphism
= poly + morphs (2 Greek words)
- many + forms
=>> many forms
 */

// 1. Compile time Polymorphism => Method Overloading or Constructor Overloading

class A {
    void sum(int a, int b) {
        System.out.println("Sum - "+a+b);
    }
    
    void sum(int a, int b, int c) {
        System.out.println("Sum - "+a+b);
    }
    void sum(int a, double b) {
        System.out.println("Sum - "+a+b);
    }
    void sum(double a, int b) {
        System.out.println("Sum - "+a+b);
    }

}

public class Test {
    public static void main(String[] args) {
        A a = new A();

        a.sum(10, 20);
        a.sum(10, 20, 30);
        a.sum(10, 20.5);
        a.sum(10.5, 20);
    }
    
}
