public class GeneratorPatternsCPlusPlus extends GeneratorPatterns{
    public String createSingleton() {
        return "class Singleton\n" +
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
    }
    public String createSingleton(String nameOfPatterns) {
        if (nameOfPatterns.equals("name")) {
            return "class name\n" +
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
        }
        else {
            return "class Human\n" +
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
        }
    }
}
