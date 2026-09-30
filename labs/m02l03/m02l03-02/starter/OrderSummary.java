public record OrderSummary(
        String id,
        int itemCount,
        String status) {

    public OrderSummary {
        if (itemCount < 0) {
            throw new IllegalArgumentException("count cannot be negative");
        }
    }
}
