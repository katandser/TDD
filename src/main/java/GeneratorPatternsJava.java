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
        if (basicClass.equals(delegationClass) == true) {
            return "class " + basicClass + " {\n" +
                    "}\n" +
                    "\n" +
                    "class " + delegationClass + "1" + " {\n" +
                    "    " + basicClass + " " + basicClass.toLowerCase() + " = new " + basicClass + "();\n" +
                    "}";
        }
        else {
            return "class " + basicClass + " {\n" +
                    "}\n" +
                    "\n" +
                    "class " + delegationClass + " {\n" +
                    "    " + basicClass + " " + basicClass.toLowerCase() + " = new " + basicClass + "();\n" +
                    "}";
        }
    }
    public String createDelegation(String basicClass, String delegationClass, String ... method) {
        return new String();
    }
}