// Modern Java: Virtual Threads & High-Throughput Services — lesson m01l02 — Release Trains And Long Term Support
// https://learnsome.tech/courses/java-course/watch?lesson=m01l02
// © LearnSome.tech
public class WhichJava {

    public static void main(String[] args) {
        Runtime.Version version = Runtime.version();
        System.out.println("feature: " + version.feature());
        System.out.println("class file: " + (version.feature() + 44));
    }
}
