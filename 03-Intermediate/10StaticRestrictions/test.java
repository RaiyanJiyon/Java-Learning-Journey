//we cannot call non static variable/method in a static method.

class StaticMethod {

    int x;
    static int y;

    void display1() {
        System.out.println("I am non Static method.");

        //We can call static variable/method in non-static method.
        display2(); 
        x = 5;
        y = 10;
    }
    static void display2() {
        System.out.println("I am a Static method.");
        // display1(); ->> this line will throw error.
        // x = 50; ->> this line will throw error.
        y = 20; // this will works, because y is a static variable.
    }
}

public class test {
    public static void main(String[] args) {
        StaticMethod s1 = new StaticMethod();
        s1.display1();

        StaticMethod.display2();
    }
    
}
