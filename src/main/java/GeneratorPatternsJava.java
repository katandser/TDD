public class GeneratorPatternsJava extends GeneratorPatterns{
    public String createSingleton() {
        return new String(" class Singleton {\n" +
                "    private static Singleton instance;\n" +
                "    private Singleton() {}\n" +
                "    public static Singleton getInstance() {\n" +
                "        if (instance == null) {\n" +
                "            instance = new Singleton();\n" +
                "        }\n" +
                "        return instance;\n" +
                "    }\n" +
                "} ");
    }
}
