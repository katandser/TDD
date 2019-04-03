public class GeneratorPatternsJava extends GeneratorPatterns{
    public String createSingleton() {
        return  " class Singleton {\n" +
                "    private static Singleton instance;\n" +
                "    private Singleton() {}\n" +
                "    public static Singleton getInstance() {\n" +
                "        if (instance == null) {\n" +
                "            instance = new Singleton();\n" +
                "        }\n" +
                "        return instance;\n" +
                "    }\n" +
                "} ";
    }
    public String createSingleton(String nameOfPattern) {
        if (nameOfPattern.equals("name")) {
            return  " class name {\n" +
                    "    private static Singleton instance;\n" +
                    "    private Singleton() {}\n" +
                    "    public static Singleton getInstance() {\n" +
                    "        if (instance == null) {\n" +
                    "            instance = new Singleton();\n" +
                    "        }\n" +
                    "        return instance;\n" +
                    "    }\n" +
                    "} ";
        }
        else {
            return  " class Server {\n" +
                    "    private static Singleton instance;\n" +
                    "    private Singleton() {}\n" +
                    "    public static Singleton getInstance() {\n" +
                    "        if (instance == null) {\n" +
                    "            instance = new Singleton();\n" +
                    "        }\n" +
                    "        return instance;\n" +
                    "    }\n" +
                    "} ";
        }
    }
}
