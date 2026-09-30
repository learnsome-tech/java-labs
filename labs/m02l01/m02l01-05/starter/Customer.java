public record Customer(String id, String email) {
    public Customer {
        if (id.isBlank() || email.isBlank()) {
            throw new IllegalArgumentException("customer fields are required");
        }
    }
}
