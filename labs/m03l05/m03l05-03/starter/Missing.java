import java.util.*;
public class Missing {
    public static void main(String[] args) {
        Optional<String> value = Optional.empty();
        System.out.println(value.orElse("MISSING"));
    }
}
