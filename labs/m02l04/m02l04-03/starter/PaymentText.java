public class PaymentText {
    sealed interface PaymentResult permits Approved, Declined, Pending { }
    record Approved(String id) implements PaymentResult { }
    record Declined(String reason) implements PaymentResult { }
    record Pending(String id) implements PaymentResult { }
    static String describe(PaymentResult result) {
        return switch (result) {
            case Approved value -> "approved " + value.id();
            case Declined value -> "declined " + value.reason();
            case Pending value -> "pending " + value.id();
        };
    }
}
