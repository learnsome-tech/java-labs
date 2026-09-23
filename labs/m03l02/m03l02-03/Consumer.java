// Modern Java: Virtual Threads & High-Throughput Services — lesson m03l02 — Generics And Collections
// https://learnsome.tech/courses/java-course/watch?lesson=m03l02
// © LearnSome.tech
import java.util.*;
public class Consumer {
    static void addDefaults(List<? super Integer> values) {
        values.add(1);
        values.add(2);
    }
    public static void main(String[] args) {
        List<Number> values = new ArrayList<>();
        addDefaults(values);
        System.out.println(values);
    }
}
