package ConditionalOperator;

public class ConditionalOperator {
   public static void main(String[] args) {
    // Ternary operator 
    // expression1 ? expression2 : expression3

    int x = 10;
    int y = 20;

    int large = (x > y) ? x : y;
    System.err.println("Largest Number - "+large);
   } 
}
