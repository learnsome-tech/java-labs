import java.util.concurrent.*;
public class Pool {
    public static void main(String[] args) throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        Future<Integer> result = pool.submit(() -> 6 * 7);
        System.out.println(result.get());
        pool.shutdown();
    }
}
