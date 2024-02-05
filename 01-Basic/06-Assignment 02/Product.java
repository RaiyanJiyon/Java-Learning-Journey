/*
 * Assignment-2 (Variable and Data type)
 * step 1: create a class called Product
 * step 2: create a main method
 * step 3: declare variables: id, title, price, description, category
 * step 4: assign the following data in main method
 * 101,iphone15,1895 euros,perfect product with best image quality, phone,
* step 5: print the data
 */

public class Product {
    public static void main(String[] args) {
        int id = 101;
        String title = "iphone15";
        float price = 1895;
        String description = "perfect product with best image quality";
        String category = "phone";

        System.err.println(id);
        System.err.println(title);
        System.err.println(price+" euros");
        System.err.println(description);
        System.err.println(category);
    }
}
