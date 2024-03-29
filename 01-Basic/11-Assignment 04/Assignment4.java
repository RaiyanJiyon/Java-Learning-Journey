import java.util.Scanner;

// Create a program to calculate installment amount for per month
public class Assignment4 {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int phonePrice = 1800; // 1800 euros
            int numberOfInstallment, installmentPerMonth;

            System.out.print("Number of installments? :");
            // get number of installments from user
            numberOfInstallment = input.nextInt();

            // calculate installment amount for per month
            if (numberOfInstallment > 0) {
                installmentPerMonth = phonePrice / numberOfInstallment;
                System.out.println("Monthly installment Amount: " + installmentPerMonth + " euros");
            } else {
                System.out.println("Invalid Number, Please Enter Valid Integer Number");
            }

        }

    }
}