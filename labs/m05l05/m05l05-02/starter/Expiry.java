import java.time.Clock;
import java.time.Instant;

public class Expiry {
    private final Clock clock;
    public Expiry(Clock clock) { this.clock = clock; }
    boolean expired(Instant deadline) {
        return deadline.isBefore(Instant.now(clock));
    }
}
