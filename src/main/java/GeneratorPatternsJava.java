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
        return  " class " + nameOfPattern + " {\n" +
                "    private static " + nameOfPattern + " instance;\n" +
                "    private " + nameOfPattern + "() {}\n" +
                "    public static " + nameOfPattern + " getInstance() {\n" +
                "        if (instance == null) {\n" +
                "            instance = new " + nameOfPattern + "();\n" +
                "        }\n" +
                "        return instance;\n" +
                "    }\n" +
                "} ";
    }

    public String createDelegation(String basicClass, String delegationClass) {
        return "class A {\n" +
                "}\n" +
                "\n" +
                "class B {\n" +
                "    A a = new A();\n" +
                "}";
    }

    public String createDelegation(String basicClass, String delegationClass, String ... method) {
        return new String();
    }
}