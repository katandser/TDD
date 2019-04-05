import org.junit.Test;
import static org.junit.Assert.*;

public class TestCreateSingletonForJava {
    @Test
    public void createSingletonReturnsStringWithValue() {
        GeneratorPatternsJava generatorPatterns = new GeneratorPatternsJava();
        assertNotEquals(0, generatorPatterns.createSingleton().length());
    }
    @Test
    public void assertReturningValuesWithExample() {
        String string =" class Singleton {\n" +
                "    private static Singleton instance;\n" +
                "    private Singleton() {}\n" +
                "    public static Singleton getInstance() {\n" +
                "        if (instance == null) {\n" +
                "            instance = new Singleton();\n" +
                "        }\n" +
                "        return instance;\n" +
                "    }\n" +
                "} ";
        GeneratorPatternsJava generatorPatterns = new GeneratorPatternsJava();
        assertEquals(string,generatorPatterns.createSingleton());
    }
    @Test
    public void assertReturningValuesWithExampleWhichTheHaveNameOf_name_() {
        String string =" class name {\n" +
                "    private static name instance;\n" +
                "    private name() {}\n" +
                "    public static name getInstance() {\n" +
                "        if (instance == null) {\n" +
                "            instance = new name();\n" +
                "        }\n" +
                "        return instance;\n" +
                "    }\n" +
                "} ";
        GeneratorPatternsJava generatorPatterns = new GeneratorPatternsJava();
        assertEquals(string,generatorPatterns.createSingleton("name"));
    }
    @Test
    public void assertReturningValuesWithExampleWhichTheHaveNameOf_Server_() {
        String string =" class Server {\n" +
                "    private static Server instance;\n" +
                "    private Server() {}\n" +
                "    public static Server getInstance() {\n" +
                "        if (instance == null) {\n" +
                "            instance = new Server();\n" +
                "        }\n" +
                "        return instance;\n" +
                "    }\n" +
                "} ";
        GeneratorPatternsJava generatorPatterns = new GeneratorPatternsJava();
        assertEquals(string,generatorPatterns.createSingleton("Server"));
    }
    @Test
    public void assertReturningValuesWithExampleWhichTheHaveNameOf_Singleton_() {
        String string =" class Singleton {\n" +
                "    private static Singleton instance;\n" +
                "    private Singleton() {}\n" +
                "    public static Singleton getInstance() {\n" +
                "        if (instance == null) {\n" +
                "            instance = new Singleton();\n" +
                "        }\n" +
                "        return instance;\n" +
                "    }\n" +
                "} ";
        GeneratorPatternsJava generatorPatterns = new GeneratorPatternsJava();
        assertEquals(string,generatorPatterns.createSingleton("Singleton"));
    }
    @Test
    public void assertReturnValueDelegationA_B() {
        String string =
                "class A {\n" +
                        "}\n" +
                        "\n" +
                        "class B {\n" +
                        "    A a = new A();\n" +
                        "}"
                ;
        GeneratorPatternsJava generatorPatterns = new GeneratorPatternsJava();
        assertEquals(string,generatorPatterns.createDelegation("A","B"));
    }
    @Test
    public void assertReturnValueDelegationA_C() {
        String string =
                "class A {\n" +
                        "}\n" +
                        "\n" +
                        "class C {\n" +
                        "    A a = new A();\n" +
                        "}"
                ;
        GeneratorPatternsJava generatorPatterns = new GeneratorPatternsJava();
        assertEquals(string,generatorPatterns.createDelegation("A","C"));
    }
    @Test
    public void assertReturnValueDelegationB_C() {
        String string =
                "class B {\n" +
                        "}\n" +
                        "\n" +
                        "class C {\n" +
                        "    B b = new B();\n" +
                        "}"
                ;
        GeneratorPatternsJava generatorPatterns = new GeneratorPatternsJava();
        assertEquals(string,generatorPatterns.createDelegation("B","C"));
    }
    @Test
    public void assertReturnValueDelegationB_B() {
        String string =
                "class B {\n" +
                        "}\n" +
                        "\n" +
                        "class B1 {\n" +
                        "    B b = new B();\n" +
                        "}"
                ;
        GeneratorPatternsJava generatorPatterns = new GeneratorPatternsJava();
        assertEquals(string,generatorPatterns.createDelegation("B","B"));
    }
    @Test
    public void assertReturnValueDelegationC_C() {
        String string =
                "class C {\n" +
                        "}\n" +
                        "\n" +
                        "class C1 {\n" +
                        "    C c = new C();\n" +
                        "}"
                ;
        GeneratorPatternsJava generatorPatterns = new GeneratorPatternsJava();
        assertEquals(string,generatorPatterns.createDelegation("C","C"));
    }
}

