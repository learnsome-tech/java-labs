// Modern Java: Virtual Threads & High-Throughput Services — lesson m08l02 — Spring Data Repositories
// https://learnsome.tech/courses/java-course/watch?lesson=m08l02
// © LearnSome.tech
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OrderRepository
        extends JpaRepository<OrderEntity, String> {
    List<OrderEntity> findByStatus(String status);
}
