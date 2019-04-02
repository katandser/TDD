import org.junit.Test;
import static org.junit.Assert.*;

public class TestCreateSingletonForJava {
    @Test
    public void createSingletonReturnsString() {
        String string = new String();
        GeneratorPatternsJava generatorPatterns = new GeneratorPatternsJava();
        assertEquals(string, generatorPatterns.createSingleton());
    }
    @Test
    public void createSingletonReturnsStringWithValue() {
        String string = new String();
        GeneratorPatternsJava generatorPatterns = new GeneratorPatternsJava();
        assertNotEquals(0, generatorPatterns.createSingleton().length());
    }
}