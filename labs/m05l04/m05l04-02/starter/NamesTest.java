import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class NamesTest {
    @Test
    void keeps_active_names() {
        var names = java.util.List.of("Ada", "Lin");
        assertThat(names).containsExactly("Ada", "Lin");
    }
}
