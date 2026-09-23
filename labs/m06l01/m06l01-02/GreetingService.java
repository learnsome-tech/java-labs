// Modern Java: Virtual Threads & High-Throughput Services — lesson m06l01 — Dependency Injection And The IoC Container
// https://learnsome.tech/courses/java-course/watch?lesson=m06l01
// © LearnSome.tech
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    private final Clock clock;

    public GreetingService(Clock clock) {
        this.clock = clock;
    }
}
