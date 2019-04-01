import org.junit.Test;

public class TestMetodsCall {
    @Test
    public void callMetodCreateSingletonForJava() {
            GeneratorPatternsJava generatorPatternsJava = new GeneratorPatternsJava();
            generatorPatternsJava.createSingleton();
    }
    @Test
    public void callMetodCreateSingletonForCPlusPlus() {
        GeneratorPatternsCPlusPlus generatorPatternsCPlusPlus = new GeneratorPatternsCPlusPlus();
        generatorPatternsCPlusPlus.createSingleton();
    }
    @Test
    public void callcallMetodCreateSingletonForUnknowGenerator() {
        GeneratorPatterns[] arrayGeneratorPatterns = {new GeneratorPatternsCPlusPlus(), new GeneratorPatternsJava()};
        arrayGeneratorPatterns[0].createSingleton();
        arrayGeneratorPatterns[1].createSingleton();
    }
}
