public sealed interface PaymentResult
        permits Approved, Declined, Pending {
}

record Approved(String id) implements PaymentResult { }
record Declined(String reason) implements PaymentResult { }
record Pending(String id) implements PaymentResult { }
