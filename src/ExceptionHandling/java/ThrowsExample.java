package ExceptionHandling.java;

public class ThrowsExample {
    static void check() throws ArithmeticException {
        throw new ArithmeticException("Exception thrown");
    }

    public static void main(String[] args) {
        try {
            check();
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e);
        }
    }
}
