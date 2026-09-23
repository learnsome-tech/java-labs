// Modern Java: Virtual Threads & High-Throughput Services — lesson m02l03 — Records And Data Classes
// https://learnsome.tech/courses/java-course/watch?lesson=m02l03
// © LearnSome.tech
public record Price(long cents) {
    public String formatted() {
        return cents / 100 + "." + cents % 100;
    }
}
