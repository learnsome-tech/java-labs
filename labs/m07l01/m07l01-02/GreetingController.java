// Modern Java: Virtual Threads & High-Throughput Services — lesson m07l01 — Controllers And Routing
// https://learnsome.tech/courses/java-course/watch?lesson=m07l01
// © LearnSome.tech
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @GetMapping("/orders")
    String list() { return "orders"; }
}
