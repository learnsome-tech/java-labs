// Modern Java: Virtual Threads & High-Throughput Services — lesson m04l05 — Async With CompletableFuture
// https://learnsome.tech/courses/java-course/watch?lesson=m04l05
// © LearnSome.tech
import java.util.concurrent.*;
public class Async {
    public static void main(String[] args) {
        CompletableFuture<String> result = CompletableFuture
                .supplyAsync(() -> "ready")
                .thenApply(String::toUpperCase);
        System.out.println(result.join());
    }
}
