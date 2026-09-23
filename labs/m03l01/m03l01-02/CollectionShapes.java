// Modern Java: Virtual Threads & High-Throughput Services — lesson m03l01 — The Collections Framework
// https://learnsome.tech/courses/java-course/watch?lesson=m03l01
// © LearnSome.tech
import java.util.*;
public class CollectionShapes {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("a", "a"));
        Set<String> set = new LinkedHashSet<>(list);
        Map<String, Integer> map = Map.of("a", 2);
        System.out.println(list.size() + " " + set.size() + " " + map.get("a"));
    }
}
