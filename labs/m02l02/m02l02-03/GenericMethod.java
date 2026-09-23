// Modern Java: Virtual Threads & High-Throughput Services — lesson m02l02 — Generics Fundamentals
// https://learnsome.tech/courses/java-course/watch?lesson=m02l02
// © LearnSome.tech
public class GenericMethod {
    public static <T> T first(T left, T right) {
        return left;
    }

    public static void main(String[] args) {
        String answer = first("ready", "later");
        System.out.println(answer);
    }
}
