// Modern Java: Virtual Threads & High-Throughput Services — lesson m03l01 — The Collections Framework
// https://learnsome.tech/courses/java-course/watch?lesson=m03l01
// © LearnSome.tech
import java.util.LinkedHashMap;
import java.util.Map;

public class Index {
    private final Map<String, Integer> positions = new LinkedHashMap<>();

    void remember(String key, int position) {
        positions.put(key, position);
    }
}
