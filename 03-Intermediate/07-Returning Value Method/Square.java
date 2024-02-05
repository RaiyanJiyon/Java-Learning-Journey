class Number {
    int squareNumber(int value) {
        return value * value;
    }
}


public class Square {
    public static void main(String[] args) {
        Number n1 = new Number();
        System.out.println("Square of 5 is - "+n1.squareNumber(5));
        
    }
    
}
