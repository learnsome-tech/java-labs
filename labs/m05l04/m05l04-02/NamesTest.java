// Modern Java: Virtual Threads & High-Throughput Services — lesson m05l04 — Fluent Assertions With AssertJ
// https://learnsome.tech/courses/java-course/watch?lesson=m05l04
// © LearnSome.tech
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class NamesTest {
    @Test
    void keeps_active_names() {
        var names = java.util.List.of("Ada", "Lin");
        assertThat(names).containsExactly("Ada", "Lin");
    }
}
