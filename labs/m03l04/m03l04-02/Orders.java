// Modern Java: Virtual Threads & High-Throughput Services — lesson m03l04 — Advanced Stream Operations
// https://learnsome.tech/courses/java-course/watch?lesson=m03l04
// © LearnSome.tech
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
