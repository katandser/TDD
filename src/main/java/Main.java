public class Main {
    public static void main(String[] args) {
        GeneratorPatternsCPlusPlus generatorPatternsCPlusPlus = new GeneratorPatternsCPlusPlus();
        GeneratorPatternsJava generatorPatternsJava = new GeneratorPatternsJava();
        System.out.println( generatorPatternsCPlusPlus.createSingleton() + "\n\n");
        System.out.println( generatorPatternsCPlusPlus.createSingleton("One") + "\n\n");
        System.out.println( generatorPatternsJava.createSingleton() + "\n\n");
        System.out.println( generatorPatternsJava.createSingleton("Two") + "\n\n");
        System.out.println( generatorPatternsJava.createDelegation("First", "Second") + "\n\n");
        System.out.println( generatorPatternsJava.createDelegation("Private", "Public") + "\n\n");
    }
}