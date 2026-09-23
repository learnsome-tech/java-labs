// Modern Java: Virtual Threads & High-Throughput Services — lesson m03l04 — Advanced Stream Operations
// https://learnsome.tech/courses/java-course/watch?lesson=m03l04
// © LearnSome.tech
import java.util.*;
public class AnyMatch {
    public static void main(String[] args) {
        boolean found = List.of(2, 4, 7, 8).stream()
                .anyMatch(value -> value % 2 != 0);
        System.out.println(found);
    }
}
