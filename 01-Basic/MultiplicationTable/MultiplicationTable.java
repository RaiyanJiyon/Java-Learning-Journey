package MultiplicationTable;

import java.util.Scanner;

public class MultiplicationTable {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter First Number: ");
    int FirstNum = input.nextInt(); 
    System.out.print("Enter Last Number: ");
    int LastNum = input.nextInt();
    
    for (int i = FirstNum; i <= LastNum; i++) {

        for (int j =1 ; j <= 10; j++) {
            
            System.out.println(i+" X "+j+" = "+i*j);
        }
        System.out.println("\n\n");
    }
   }
}
