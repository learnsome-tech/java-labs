// Modern Java: Virtual Threads & High-Throughput Services — lesson m06l03 — Configuration And Profiles
// https://learnsome.tech/courses/java-course/watch?lesson=m06l03
// © LearnSome.tech
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "service")
public record ServiceSettings(String name, int timeoutSeconds) { }
