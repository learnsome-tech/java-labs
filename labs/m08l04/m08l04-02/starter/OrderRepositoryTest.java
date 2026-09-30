@Testcontainers
class OrderRepositoryTest {
    @Container
    static PostgreSQLContainer<?> database =
            new PostgreSQLContainer<>("postgres:16");
}
