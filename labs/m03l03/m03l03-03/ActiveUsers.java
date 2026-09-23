// Modern Java: Virtual Threads & High-Throughput Services — lesson m03l03 — The Streams API
// https://learnsome.tech/courses/java-course/watch?lesson=m03l03
// © LearnSome.tech
import java.util.List;

public class ActiveUsers {
    static List<String> names(List<User> users) {
        return users.stream()
                .filter(User::active)
                .map(User::name)
                .toList();
    }

    record User(String name, boolean active) { }
}
