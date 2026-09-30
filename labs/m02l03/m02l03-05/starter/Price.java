public record Price(long cents) {
    public String formatted() {
        return cents / 100 + "." + cents % 100;
    }
}
