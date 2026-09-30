import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
class ApiAdvice {
    @ExceptionHandler(OrderMissing.class)
    ProblemDetail missing(OrderMissing error) {
        return ProblemDetail.forStatusAndDetail(404, error.getMessage());
    }
}
