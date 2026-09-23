// Modern Java: Virtual Threads & High-Throughput Services — lesson m03l02 — Generics And Collections
// https://learnsome.tech/courses/java-course/watch?lesson=m03l02
// © LearnSome.tech
import java.util.*;
public class Producer {
    static double total(List<? extends Number> values) {
        return values.stream().mapToDouble(Number::doubleValue).sum();
    }
    public static void main(String[] args) {
        System.out.println(total(List.of(2, 3)));
    }
}
