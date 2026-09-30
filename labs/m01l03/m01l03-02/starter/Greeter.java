/** One class, one file: the unit javac turns into a class file. */
public class Greeter {

    private final String name;

    public Greeter(String name) {
        this.name = name;
    }

    public String greet() {
        return "Hello, " + name;
    }

    public static void main(String[] args) {
        System.out.println(new Greeter("world").greet());
        System.out.println(new Greeter("Java").greet());
    }
}
