public class Describe {
    static String describe(Object value) {
        if (value instanceof String text && !text.isBlank()) {
            return text.toUpperCase();
        }
        return "empty";
    }
    public static void main(String[] args) {
        System.out.println(describe("ready"));
    }
}
