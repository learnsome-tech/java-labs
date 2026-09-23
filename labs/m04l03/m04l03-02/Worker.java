// Modern Java: Virtual Threads & High-Throughput Services — lesson m04l03 — Concurrency Basics: Threads And Runnable
// https://learnsome.tech/courses/java-course/watch?lesson=m04l03
// © LearnSome.tech
public class Worker {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> System.out.println("work"));
        worker.start();
        worker.join();
        System.out.println("done");
    }
}
