public class Worker {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> System.out.println("work"));
        worker.start();
        worker.join();
        System.out.println("done");
    }
}
