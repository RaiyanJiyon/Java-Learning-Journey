import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        // Create a Random object
        Random random = new Random();

        // Generate a random integer between 1 (inclusive) and 4 (exclusive)
        int randomNumber = random.nextInt(3) + 1;

        // Print the random number
        System.out.println("Random Value - " + randomNumber);
    }
}
