// Modern Java: Virtual Threads & High-Throughput Services — lesson m04l04 — The ExecutorService
// https://learnsome.tech/courses/java-course/watch?lesson=m04l04
// © LearnSome.tech
import java.util.concurrent.*;
public class Pool {
    public static void main(String[] args) throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        Future<Integer> result = pool.submit(() -> 6 * 7);
        System.out.println(result.get());
        pool.shutdown();
    }
}
