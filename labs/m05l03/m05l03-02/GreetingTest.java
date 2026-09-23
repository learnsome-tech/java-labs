// Modern Java: Virtual Threads & High-Throughput Services — lesson m05l03 — Testing Basics With JUnit 5
// https://learnsome.tech/courses/java-course/watch?lesson=m05l03
// © LearnSome.tech
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingTest {
    @Test
    void greets_a_name() {
        assertEquals("Hello Ada", Greeting.text("Ada"));
    }
}
