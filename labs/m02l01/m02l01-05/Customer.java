// Modern Java: Virtual Threads & High-Throughput Services — lesson m02l01 — Primitive And Reference Types
// https://learnsome.tech/courses/java-course/watch?lesson=m02l01
// © LearnSome.tech
public record Customer(String id, String email) {
    public Customer {
        if (id.isBlank() || email.isBlank()) {
            throw new IllegalArgumentException("customer fields are required");
        }
    }
}
