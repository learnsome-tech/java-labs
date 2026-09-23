// Modern Java: Virtual Threads & High-Throughput Services — lesson m02l02 — Generics Fundamentals
// https://learnsome.tech/courses/java-course/watch?lesson=m02l02
// © LearnSome.tech
public class GenericBox<T> {
    private T value;

    public void put(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
