import java.util.*;
public class AnyMatch {
    public static void main(String[] args) {
        boolean found = List.of(2, 4, 7, 8).stream()
                .anyMatch(value -> value % 2 != 0);
        System.out.println(found);
    }
}
