class StaticMethod {

    void display1() {
        System.out.println("I am non Static method.");
    }
    static void display2() {
        System.out.println("I am a Static method.");
    }
}

public class test {
    public static void main(String[] args) {
        StaticMethod s1 = new StaticMethod();
        s1.display1(); //if we want to call non static method, we have to create object.

        StaticMethod.display2(); //if we want to call static method, we don't have to create object.
    }
    
}
