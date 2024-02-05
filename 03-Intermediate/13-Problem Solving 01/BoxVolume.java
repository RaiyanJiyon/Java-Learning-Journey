/*
 Create a class called Box that include three pieces of information as instance variables- height, width
and depth double) of two boxes. Your class should have a constructor and initializes the three
instance variables. Provide a method displayVOI that display the volume Of two boxes. 
suppose, the values of instance variables for the first box's are (10, 10, 10) and second box's are (20, 30, 10).
Write a test application named BaxVolume that demonstrate class Box's capabilities.
 */

 class Box {
    int height;
    int width;
    double depth; // Changed to double for accurate volume calculation

    public Box(int height, int width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    void displayVOI() {
        double volume = height * width * depth;
        System.out.println("Volume: " + volume);
    }
}

public class BoxVolume {
    public static void main(String[] args) {
        Box box1 = new Box(10, 10, 10);
        box1.displayVOI();

        Box box2 = new Box(20, 30, 10);
        box2.displayVOI();
    }
}
