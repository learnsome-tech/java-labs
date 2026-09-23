// Modern Java: Virtual Threads & High-Throughput Services — lesson m03l03 — The Streams API
// https://learnsome.tech/courses/java-course/watch?lesson=m03l03
// © LearnSome.tech
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
