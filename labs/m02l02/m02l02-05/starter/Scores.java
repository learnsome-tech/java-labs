import java.util.List;

public class Scores {
    public static <T extends Comparable<T>> T larger(
            T left, T right) {
        return left.compareTo(right) >= 0 ? left : right;
    }
}
