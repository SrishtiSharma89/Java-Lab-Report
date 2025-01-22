public class FinallyExample {
    public static void main(String[] args) {
        try {
            int data = 50 / 0;
            System.out.println(data);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught.");
        } finally {
            System.out.println("This is the finally block.");
        }
    }
}
