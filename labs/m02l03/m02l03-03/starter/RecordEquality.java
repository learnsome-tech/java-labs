public record Point(int x, int y) {
    public static void main(String[] args) {
        Point first = new Point(2, 3);
        Point second = new Point(2, 3);
        System.out.println(first.equals(second));
    }
}
