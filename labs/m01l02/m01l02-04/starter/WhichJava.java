public class WhichJava {

    public static void main(String[] args) {
        Runtime.Version version = Runtime.version();
        System.out.println("feature: " + version.feature());
        System.out.println("class file: " + (version.feature() + 44));
    }
}
