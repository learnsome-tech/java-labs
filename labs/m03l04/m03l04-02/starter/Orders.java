import java.util.*;
public class Orders {
    public static void main(String[] args) {
        List<List<String>> groups = List.of(
                List.of("a", "b"), List.of("b", "c"));
        List<String> result = groups.stream().flatMap(List::stream)
                .distinct().sorted().toList();
        System.out.println(result);
    }
}
