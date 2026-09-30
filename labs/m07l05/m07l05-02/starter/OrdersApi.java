import org.springframework.web.bind.annotation.*;

@RestController
class OrdersApi {
    @GetMapping("/orders/{id}")
    OrderView get(@PathVariable String id) {
        return new OrderView(id, "ready");
    }
    record OrderView(String id, String status) { }
}
