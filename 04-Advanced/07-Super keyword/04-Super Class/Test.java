class Vehicle {
    // Instance variables for model and weight
    String model;
    double weight;

    // Parameterized constructor to initialize model and weight
    public Vehicle(String model, double weight) {
        this.model = model;
        this.weight = weight;
    }

    // Display method to print model and weight
    void display() {
        System.out.println("Model - " + model);
        System.out.println("Weight - " + weight);
    }
}

class Car extends Vehicle {
    // Additional instance variable for gear in the Car class
    int gear;

    // Parameterized constructor for Car class, invoking superclass constructor using 'super'
    public Car(String model, double weight, int gear) {
        super(model, weight);
        this.gear = gear;
    }

    // Override the display method in the Car class
    @Override
    void display() {
        // Call the display method of the superclass using 'super'
        super.display();
        
        // Display the gear specific to the Car class
        System.out.println("Gear - " + gear);
    }
}

public class Test {
    public static void main(String[] args) {
        // Create an instance of the Car class
        Car c = new Car("BMW-234", 200.67, 20);

        // Call the display method of the Car class
        c.display();
    }
}
