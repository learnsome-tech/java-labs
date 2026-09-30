public class Traffic {
    enum Light { RED, GREEN }
    static String action(Light light) {
        return switch (light) {
            case RED -> "stop";
            case GREEN -> "go";
        };
    }
    public static void main(String[] args) {
        System.out.println(action(Light.GREEN));
    }
}
