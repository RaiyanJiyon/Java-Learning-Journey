import java.util.Arrays;

public class Descending {
    public static void main(String[] args) {
        // Sorting an array of numbers in ascending order
        int[] num = { 10, -5, 1, -7, 101, 77 };
        Arrays.sort(num);

        System.out.println("Descending Numbers: ");
    
        // Print the sorted numbers in descending order by iterating from the last index to the first
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + "\t");
        }

        // Sorting an array of names in ascending order
        String[] names = { "Raiyan", "Sabbir", "Ishaq", "Tamim", "Mahabub", "Gourab" };
        Arrays.sort(names);

        System.out.println("\nDescending Names: ");
        
        // Print the sorted names in descending order by iterating from the last index to the first
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.print(names[i] + "\t");
        }
    }
}
