import java.util.Random;

public class TestDemo {

    public int addPositive(int a, int b) {
        // Check if either parameter is zero or negative
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Both parameters must be positive!");
        }
        
        // Return the sum of the two positive parameters
        return a + b;
    }
    
    int randomNumberSquared() {
        // Get a random integer between 1 and 10 (inclusive)
        int randomInt = getRandomInt();
        
        // Return the square of the random integer
        return randomInt * randomInt;
    }
    
    int getRandomInt() {
        // Create a new instance of the Random class
        Random random = new Random();
        
        // Generate a random integer between 1 and 10 (inclusive)
        // by calling nextInt(10) and adding 1 to the result
        return random.nextInt(10) + 1;
    }
}
