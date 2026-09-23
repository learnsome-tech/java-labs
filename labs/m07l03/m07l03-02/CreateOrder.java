// Modern Java: Virtual Threads & High-Throughput Services — lesson m07l03 — Validation
// https://learnsome.tech/courses/java-course/watch?lesson=m07l03
// © LearnSome.tech
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record CreateOrder(
        @NotBlank String sku,
        @Positive int quantity) {
}
