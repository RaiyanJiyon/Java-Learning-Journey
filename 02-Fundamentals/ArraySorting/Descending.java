package ArraySorting;

import java.util.Arrays;

public class Descending {
    public static void main(String[] args) {
        int[] num = { 10, -5, 1, -7, 101, 77 };

        Arrays.sort(num);

        System.out.println("Descending Numbers: ");
    
        // Start the loop index from the last index of the array
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + "\t");
        }

        String[] names = { "Raiyan", "Sabbir", "Ishaq", "Tamim", "Mahabub", "Gourab" };

        Arrays.sort(names);

        System.out.println("\nDescending Names: ");
        
        // Start the loop index from the last index of the array
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.print(names[i] + "\t");
        }
    }
}
