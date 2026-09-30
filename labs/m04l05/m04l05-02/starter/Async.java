import java.util.concurrent.*;
public class Async {
    public static void main(String[] args) {
        CompletableFuture<String> result = CompletableFuture
                .supplyAsync(() -> "ready")
                .thenApply(String::toUpperCase);
        System.out.println(result.join());
    }
}
