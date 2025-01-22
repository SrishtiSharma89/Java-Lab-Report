public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Division by zero
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
