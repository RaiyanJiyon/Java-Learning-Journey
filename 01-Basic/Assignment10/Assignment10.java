// find sum of 1-10 using for loop

package Assignment10;

public class Assignment10 {
    public static void main(String[] args) {
        int result = 0;

        for (int i = 1; i <= 10; i++) {
            result = result + i;
        }
        System.out.println("Sum Of (1-10) Digit - "+result);
    }
}
