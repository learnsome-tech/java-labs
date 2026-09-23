// Modern Java: Virtual Threads & High-Throughput Services — lesson m08l01 — Persistence With JPA And Hibernate
// https://learnsome.tech/courses/java-course/watch?lesson=m08l01
// © LearnSome.tech
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class OrderEntity {
    @Id
    private String id;
    private String status;

    protected OrderEntity() { }
}
