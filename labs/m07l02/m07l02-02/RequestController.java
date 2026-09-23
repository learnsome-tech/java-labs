// Modern Java: Virtual Threads & High-Throughput Services — lesson m07l02 — Reading The Request
// https://learnsome.tech/courses/java-course/watch?lesson=m07l02
// © LearnSome.tech
import org.springframework.web.bind.annotation.*;

@RestController
class RequestController {
    @GetMapping("/orders/{id}")
    String one(@PathVariable String id,
               @RequestParam(defaultValue = "false") boolean verbose) {
        return id + " " + verbose;
    }
}
