// Modern Java: Virtual Threads & High-Throughput Services — lesson m04l01 — Checked Versus Unchecked Exceptions
// https://learnsome.tech/courses/java-course/watch?lesson=m04l01
// © LearnSome.tech
import java.io.IOException;
public class Checked {
    static void read() throws IOException {
        throw new IOException("unavailable");
    }
    public static void main(String[] args) {
        try { read(); } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
