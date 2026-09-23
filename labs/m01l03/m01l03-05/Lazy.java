// Modern Java: Virtual Threads & High-Throughput Services — lesson m01l03 — The Lifecycle Of A Java Program
// https://learnsome.tech/courses/java-course/watch?lesson=m01l03
// © LearnSome.tech
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
