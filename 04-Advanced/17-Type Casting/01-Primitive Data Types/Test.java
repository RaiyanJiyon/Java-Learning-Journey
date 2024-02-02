/*
• What is Type casting ?
-> Converting one data type to another is called type casting.

1. implicit type casting
byte -> short -> long -> float -> double

2. explicit type casting
double -> float -> long -> int -> short -> byte

*/

public class Test {
    public static void main(String[] args) {

        int a = 10;
        double b = a; //implicit type casting
        System.out.println(b);


        double x = 10.5;
        int y = (int) x; //explicit type casting
        System.out.println(y);
    }
}
