// Modern Java: Virtual Threads & High-Throughput Services — lesson m05l05 — Designing Testable Code
// https://learnsome.tech/courses/java-course/watch?lesson=m05l05
// © LearnSome.tech
import java.time.Clock;
import java.time.Instant;

public class Expiry {
    private final Clock clock;
    public Expiry(Clock clock) { this.clock = clock; }
    boolean expired(Instant deadline) {
        return deadline.isBefore(Instant.now(clock));
    }
}
