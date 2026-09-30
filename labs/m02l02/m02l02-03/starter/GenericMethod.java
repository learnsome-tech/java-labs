public class GenericMethod {
    public static <T> T first(T left, T right) {
        return left;
    }

    public static void main(String[] args) {
        String answer = first("ready", "later");
        System.out.println(answer);
    }
}
