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
