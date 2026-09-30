import java.util.LinkedHashMap;
import java.util.Map;

public class Index {
    private final Map<String, Integer> positions = new LinkedHashMap<>();

    void remember(String key, int position) {
        positions.put(key, position);
    }
}
