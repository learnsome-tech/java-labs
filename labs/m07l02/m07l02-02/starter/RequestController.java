import org.springframework.web.bind.annotation.*;

@RestController
class RequestController {
    @GetMapping("/orders/{id}")
    String one(@PathVariable String id,
               @RequestParam(defaultValue = "false") boolean verbose) {
        return id + " " + verbose;
    }
}
