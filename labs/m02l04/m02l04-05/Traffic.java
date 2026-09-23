// Modern Java: Virtual Threads & High-Throughput Services — lesson m02l04 — Sealed Types And Exhaustiveness
// https://learnsome.tech/courses/java-course/watch?lesson=m02l04
// © LearnSome.tech
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
