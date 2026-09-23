// Modern Java: Virtual Threads & High-Throughput Services — lesson m03l05 — Handling Nulls With Optional
// https://learnsome.tech/courses/java-course/watch?lesson=m03l05
// © LearnSome.tech
import java.util.*;
public class Lookup {
    static Optional<String> find() { return Optional.of("ready"); }
    public static void main(String[] args) {
        String value = find().map(String::toUpperCase).orElse("MISSING");
        System.out.println(value);
    }
}
