import java.util.*;
public class Lookup {
    static Optional<String> find() { return Optional.of("ready"); }
    public static void main(String[] args) {
        String value = find().map(String::toUpperCase).orElse("MISSING");
        System.out.println(value);
    }
}
