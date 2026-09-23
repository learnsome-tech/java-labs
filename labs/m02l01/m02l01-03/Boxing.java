// Modern Java: Virtual Threads & High-Throughput Services — lesson m02l01 — Primitive And Reference Types
// https://learnsome.tech/courses/java-course/watch?lesson=m02l01
// © LearnSome.tech
public class Boxing {
    public static void main(String[] args) {
        Integer boxed = 42;
        int unboxed = boxed;
        System.out.println(boxed + unboxed);
    }
}
