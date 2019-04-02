import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCreateCingletonForJava {
    @Test
    public void createSingletonReturnsString() {
        String string = new String();
        GeneratorPatternsJava generatorPatterns = new GeneratorPatternsJava();
        assertEquals(string, generatorPatterns.createSingleton());
    }
}