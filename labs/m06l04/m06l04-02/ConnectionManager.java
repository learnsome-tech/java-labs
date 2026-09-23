// Modern Java: Virtual Threads & High-Throughput Services — lesson m06l04 — The Spring Bean Lifecycle
// https://learnsome.tech/courses/java-course/watch?lesson=m06l04
// © LearnSome.tech
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class ConnectionManager {
    @PostConstruct
    void open() { }

    @PreDestroy
    void close() { }
}
