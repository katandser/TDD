import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCreateSingletonForCPlusPlus {
    @Test
    public void createSingletonReturnsString() {
        String string = new String();
        GeneratorPatternsCPlusPlus generatorPatterns = new GeneratorPatternsCPlusPlus();
        assertEquals(string, generatorPatterns.createSingleton());
    }
    @Test
    public void assertReturningValuesWithExample() {
        String string =
                "class Singleton\n" +
                        "{\n" +
                        "  private:\n" +
                        "    static Singleton * p_instance;\n" +
                        "    // Конструкторы и оператор присваивания недоступны клиентам\n" +
                        "    Singleton() {}\n" +
                        "    Singleton( const Singleton& );  \n" +
                        "    Singleton& operator=( Singleton& );\n" +
                        "  public:\n" +
                        "    static Singleton * getInstance() {\n" +
                        "        if(!p_instance)           \n" +
                        "            p_instance = new Singleton();\n" +
                        "        return p_instance;\n" +
                        "    }\n" +
                        "};\n" +
                        "Singleton* Singleton::p_instance = 0;";
        GeneratorPatternsCPlusPlus generatorPatterns = new GeneratorPatternsCPlusPlus();
        assertEquals(string,generatorPatterns.createSingleton());
    }
}
