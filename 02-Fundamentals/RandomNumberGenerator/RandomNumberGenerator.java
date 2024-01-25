package RandomNumberGenerator;

import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random random = new Random();

        int randomNumber = random.nextInt(3) + 1; //if we want to start from 1 
        System.out.println("Random Value - "+randomNumber);
    }
    
}
