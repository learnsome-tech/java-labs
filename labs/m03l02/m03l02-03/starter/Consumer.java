import java.util.*;
public class Consumer {
    static void addDefaults(List<? super Integer> values) {
        values.add(1);
        values.add(2);
    }
    public static void main(String[] args) {
        List<Number> values = new ArrayList<>();
        addDefaults(values);
        System.out.println(values);
    }
}
