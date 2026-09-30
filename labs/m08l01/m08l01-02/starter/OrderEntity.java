import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class OrderEntity {
    @Id
    private String id;
    private String status;

    protected OrderEntity() { }
}
