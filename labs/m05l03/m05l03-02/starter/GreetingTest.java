import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingTest {
    @Test
    void greets_a_name() {
        assertEquals("Hello Ada", Greeting.text("Ada"));
    }
}
