// Modern Java: Virtual Threads & High-Throughput Services — lesson m08l04 — Database Integration With Testcontainers
// https://learnsome.tech/courses/java-course/watch?lesson=m08l04
// © LearnSome.tech
@Testcontainers
class OrderRepositoryTest {
    @Container
    static PostgreSQLContainer<?> database =
            new PostgreSQLContainer<>("postgres:16");
}
