/*
 If we call a method by passing-a-value (primitive data) then it is known as call-by-value.

 The value is copied to a method parameter.

 changes to that formal parameter doesn't affect the actual
 parameter.

 In call-by-value original value doesn't change.
 */

class Callbyvalue {
    void change(int i) {
        i = 20;
    }
}
public class CallByValueTest {
    public static void main(String[] args) {
        Callbyvalue ob1 = new Callbyvalue();
        int x = 10;
        System.out.println("Before calling - "+x);
        
        ob1.change(x);
        System.out.println("After calling - "+x);
    }
    
}
