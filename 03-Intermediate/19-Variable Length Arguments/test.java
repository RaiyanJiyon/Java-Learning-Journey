/*
 Variable length arguments or, varargs method.
 A method that takes a variable number of arguments is called a varargs method.
 */

class Variablelength {
    void sum(int ... num) {
        int sum = 0;
        for (int i : num) {
            sum = sum + i;
        }

        System.out.println(sum);
    }
}
public class test {
    public static void main(String[] args) {
        Variablelength ob1 = new Variablelength();
        
        ob1.sum(10, 20);
        ob1.sum(10, 20, 30);
        ob1.sum(10, 20, 30, 40);
        ob1.sum(10, 20, 30, 40, 50);
    }
    
}
