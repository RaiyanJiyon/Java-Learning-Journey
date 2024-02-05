import java.util.Arrays;

public class Ascending {
    public static void main(String[] args) {
        // Sorting an array of numbers in ascending order
        int[] num = { 10, -5, 1, -7, 101, 77 };
        Arrays.sort(num);

        System.out.println("Ascending Numbers: ");
        // Print the sorted numbers in ascending order
        for (int i = 0; i < 6; i++) {
            System.out.print(num[i] + "\t");
        }

        // Sorting an array of names in ascending order
        String[] names = { "Raiyan", "Sabbir", "Ishaq", "Tamim", "Mahabub", "Gourab" };
        Arrays.sort(names);

        System.out.println("\nAscending Names: ");
        // Print the sorted names in ascending order
        for (int i = 0; i < 6; i++) {
            System.out.print(names[i] + "\t");
        }
    }
}
