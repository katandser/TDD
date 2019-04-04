import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCreateSingletonForCPlusPlus {
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
    @Test
    public void assertReturningValuesWithExampleWhichTheHaveNameOf_name_() {
        String string =
                "class name\n" +
                        "{\n" +
                        "  private:\n" +
                        "    static name * p_instance;\n" +
                        "    // Конструкторы и оператор присваивания недоступны клиентам\n" +
                        "    name() {}\n" +
                        "    name( const name& );  \n" +
                        "    name& operator=( name& );\n" +
                        "  public:\n" +
                        "    static name * getInstance() {\n" +
                        "        if(!p_instance)           \n" +
                        "            p_instance = new name();\n" +
                        "        return p_instance;\n" +
                        "    }\n" +
                        "};\n" +
                        "name* name::p_instance = 0;";
        GeneratorPatternsCPlusPlus generatorPatterns = new GeneratorPatternsCPlusPlus();
        assertEquals(string,generatorPatterns.createSingleton("name"));
    }
    @Test
    public void assertReturningValuesWithExampleWhichTheHaveNameOf_Human_() {
        String string =
                "class Human\n" +
                        "{\n" +
                        "  private:\n" +
                        "    static Human * p_instance;\n" +
                        "    Human() {}\n" +
                        "    Human( const Human& );  \n" +
                        "    Human& operator=( Human& );\n" +
                        "  public:\n" +
                        "    static Human * getInstance() {\n" +
                        "        if(!p_instance)           \n" +
                        "            p_instance = new Human();\n" +
                        "        return p_instance;\n" +
                        "    }\n" +
                        "};\n" +
                        "Human* Human::p_instance = 0;";
        GeneratorPatternsCPlusPlus generatorPatterns = new GeneratorPatternsCPlusPlus();
        assertEquals(string,generatorPatterns.createSingleton("Human"));
    }

}
