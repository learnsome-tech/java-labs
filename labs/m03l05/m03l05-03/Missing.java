// Modern Java: Virtual Threads & High-Throughput Services — lesson m03l05 — Handling Nulls With Optional
// https://learnsome.tech/courses/java-course/watch?lesson=m03l05
// © LearnSome.tech
import java.util.*;
public class Missing {
    public static void main(String[] args) {
        Optional<String> value = Optional.empty();
        System.out.println(value.orElse("MISSING"));
    }
}
