class Factorial {
    int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n -1);
        }

    }
}

public class test {
    public static void main(String[] args) {
        Factorial ob = new Factorial();

        int result = ob.fact(5);
        System.out.println("Factorial of 5 is - "+result);
    }
    
}
