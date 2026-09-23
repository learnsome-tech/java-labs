// Modern Java: Virtual Threads & High-Throughput Services — lesson m02l03 — Records And Data Classes
// https://learnsome.tech/courses/java-course/watch?lesson=m02l03
// © LearnSome.tech
public record OrderSummary(
        String id,
        int itemCount,
        String status) {

    public OrderSummary {
        if (itemCount < 0) {
            throw new IllegalArgumentException("count cannot be negative");
        }
    }
}
