// Modern Java: Virtual Threads & High-Throughput Services — lesson m02l02 — Generics Fundamentals
// https://learnsome.tech/courses/java-course/watch?lesson=m02l02
// © LearnSome.tech
import java.util.List;

public class Scores {
    public static <T extends Comparable<T>> T larger(
            T left, T right) {
        return left.compareTo(right) >= 0 ? left : right;
    }
}
