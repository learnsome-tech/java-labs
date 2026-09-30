import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class ConnectionManager {
    @PostConstruct
    void open() { }

    @PreDestroy
    void close() { }
}
