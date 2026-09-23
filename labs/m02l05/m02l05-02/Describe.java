// Modern Java: Virtual Threads & High-Throughput Services — lesson m02l05 — Pattern Matching And Text Blocks
// https://learnsome.tech/courses/java-course/watch?lesson=m02l05
// © LearnSome.tech
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
