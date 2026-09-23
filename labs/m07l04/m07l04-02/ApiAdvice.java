// Modern Java: Virtual Threads & High-Throughput Services — lesson m07l04 — Exception Handling To Problem Details
// https://learnsome.tech/courses/java-course/watch?lesson=m07l04
// © LearnSome.tech
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
class ApiAdvice {
    @ExceptionHandler(OrderMissing.class)
    ProblemDetail missing(OrderMissing error) {
        return ProblemDetail.forStatusAndDetail(404, error.getMessage());
    }
}
