import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCreateSingletonForCPlusPlus {
    @Test
    public void createSingletonReturnsString() {
        String string = new String();
        GeneratorPatternsCPlusPlus generatorPatterns = new GeneratorPatternsCPlusPlus();
        assertEquals(string, generatorPatterns.createSingleton());
    }
}
