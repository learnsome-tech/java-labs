// Modern Java: Virtual Threads & High-Throughput Services — lesson m02l03 — Records And Data Classes
// https://learnsome.tech/courses/java-course/watch?lesson=m02l03
// © LearnSome.tech
public record Point(int x, int y) {
    public static void main(String[] args) {
        Point first = new Point(2, 3);
        Point second = new Point(2, 3);
        System.out.println(first.equals(second));
    }
}
