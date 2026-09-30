public record ErrorBody(String code, String detail) {
    String asJson() {
        return """
                {"code": "%s", "detail": "%s"}
                """.formatted(code, detail);
    }
}
