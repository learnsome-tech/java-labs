public class Translate {
    static class StorageFailure extends RuntimeException {
        StorageFailure(Throwable cause) { super(cause); }
    }
    static String load() {
        try { throw new java.io.IOException("disk"); }
        catch (java.io.IOException ex) { throw new StorageFailure(ex); }
    }
    public static void main(String[] args) {
        try { load(); } catch (StorageFailure ex) {
            System.out.println(ex.getCause().getMessage());
        }
    }
}
