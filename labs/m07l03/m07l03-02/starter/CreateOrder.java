import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record CreateOrder(
        @NotBlank String sku,
        @Positive int quantity) {
}
