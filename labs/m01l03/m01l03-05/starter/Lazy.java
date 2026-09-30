public class Lazy {

    static class Heavy {
        static {
            System.out.println("Heavy is being initialised");
        }

        static int value() {
            return 42;
        }
    }

    public static void main(String[] args) {
        System.out.println("started");
        System.out.println(Heavy.value());
        System.out.println("done");
    }
}
