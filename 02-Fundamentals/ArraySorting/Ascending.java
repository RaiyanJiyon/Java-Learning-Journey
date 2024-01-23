package ArraySorting;

import java.util.Arrays;

public class Ascending {
    public static void main(String[] args) {
        int[] num = { 10, -5, 1, -7, 101, 77 };

        Arrays.sort(num);

        System.out.println("Ascending Numbers: ");
        // ascending

        for (int i = 0; i < 6; i++) {
            System.out.print(num[i]+"\t");
        }

        String[] names = { "Raiyan", "Sabbir", "Ishaq", "Tamim", "Mahabub", "Gourab" };

        Arrays.sort(names);

        System.out.println("\nAscending Names: ");
        // ascending

        for (int i = 0; i < 6; i++) {
            System.out.print(names[i]+"\t");
        }

    }
}
