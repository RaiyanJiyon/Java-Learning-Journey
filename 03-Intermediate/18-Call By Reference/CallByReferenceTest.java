/*
 If we call a method by passing-n-reference type data(object,String etc.) then it is known as call-by-reference.

 changes to that formal parameter does affect the actual parameter.

 In call-by-reference original value gets change.
 */

class Callbyreference {
    String name;
    void change(Callbyreference r2) {
        r2.name = "Anis";
    }
}

public class CallByReferenceTest {
    public static void main(String[] args) {
        Callbyreference r1 = new Callbyreference();

        r1.name = "Jiyon";
        System.out.println("Before calling - "+r1.name);

        r1.change(r1);
        System.out.println("After calling - "+r1.name);
    }
}
