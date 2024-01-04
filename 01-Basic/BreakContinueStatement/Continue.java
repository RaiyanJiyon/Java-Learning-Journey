package BreakContinueStatement;

public class Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i = i + 3) {
            if (i == 10) {
                continue;
            }
            System.out.println(i);
        }
    }
    
}
