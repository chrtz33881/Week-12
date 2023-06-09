import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

public class TestDemoTest {
    private TestDemo testDemo;

    @BeforeEach
    public void setUp() {
        // Create a new instance of TestDemo before each test
        testDemo = new TestDemo();
    }

    @Test
    void assertThatTwoPositiveNumbersAreAddedCorrectly() {
        // Call the addPositive method with two positive numbers (3 and 4)
        int result = testDemo.addPositive(3, 4);
        
        // Assert that the result is equal to the expected sum (7)
        assertThat(result).isEqualTo(7);
    }

    @Test
    void assertThatNumberSquaredIsCorrect() {
        // Create a spy object of TestDemo
        TestDemo mockDemo = Mockito.spy(testDemo);
        
        // Stub the getRandomInt method of the spy object to always return 5
        doReturn(5).when(mockDemo).getRandomInt();
        
        // Call the randomNumberSquared method on the spy object
        int fiveSquared = mockDemo.randomNumberSquared();
        
        // Assert that the result is equal to the expected square of 5 (25)
        assertThat(fiveSquared).isEqualTo(25);
    }
}
