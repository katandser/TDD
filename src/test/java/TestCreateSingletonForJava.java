import org.junit.Test;
import static org.junit.Assert.*;

public class TestCreateSingletonForJava {
    @Test
    public void createSingletonReturnsStringWithValue() {
        String string = new String();
        GeneratorPatternsJava generatorPatterns = new GeneratorPatternsJava();
        assertNotEquals(0, generatorPatterns.createSingleton().length());
    }
    @Test
    public void assertReturningValuesWithExample() {
        String string = new String(" class Singleton {\n" +
                "    private static Singleton instance;\n" +
                "    private Singleton() {}\n" +
                "    public static Singleton getInstance() {\n" +
                "        if (instance == null) {\n" +
                "            instance = new Singleton();\n" +
                "        }\n" +
                "        return instance;\n" +
                "    }\n" +
                "} ");
        GeneratorPatternsJava generatorPatterns = new GeneratorPatternsJava();
        assertEquals(string,generatorPatterns.createSingleton());
    }
    @Test
    public void assertReturningValuesWithExampleWhichTheHaveNameOf_name_() {
        String string = new String(" class name {\n" +
                "    private static Singleton instance;\n" +
                "    private Singleton() {}\n" +
                "    public static Singleton getInstance() {\n" +
                "        if (instance == null) {\n" +
                "            instance = new Singleton();\n" +
                "        }\n" +
                "        return instance;\n" +
                "    }\n" +
                "} ");
        GeneratorPatternsJava generatorPatterns = new GeneratorPatternsJava();
        assertEquals(string,generatorPatterns.createSingleton("name"));
    }

}
