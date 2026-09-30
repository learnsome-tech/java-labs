import java.util.*;
import java.util.stream.*;
public class Names {
    public static void main(String[] args) {
        List<String> result = Stream.of("Ada", "Bob", "Ana")
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .toList();
        System.out.println(result);
    }
}
