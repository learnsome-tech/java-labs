// Modern Java: Virtual Threads & High-Throughput Services — lesson m07l05 — Implementing An OpenAPI Contract
// https://learnsome.tech/courses/java-course/watch?lesson=m07l05
// © LearnSome.tech
import org.springframework.web.bind.annotation.*;

@RestController
class OrdersApi {
    @GetMapping("/orders/{id}")
    OrderView get(@PathVariable String id) {
        return new OrderView(id, "ready");
    }
    record OrderView(String id, String status) { }
}
