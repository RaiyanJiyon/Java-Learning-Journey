/*
Aceess Modifier is 4 types ->
1.Public
2. Private
3.Protected
4.default
 */

class A {
    private void message1() {
        System.out.println("This is private method."); //We can't access directly private method from another class.
    }

    public void message2() {
        System.out.println("This is public method."); //We can access directly public method from any class, even from different packages.
    }

    protected void message3() {
        System.out.println("This is protected method."); //We can access directly protected method from any class in same packages. But if we can't to access it from different package's class, in that case we have to inheritate that method class.
    }

    void message4() {
        System.out.println("This is default method."); //We can access directly default method from any class in same packages. But if we can't to access it from different package's class.
    }
}

public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.message2();
    }
}
