public class MathOperations {
    int multiply(int a, int b) {
        return a * b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println("Multiplication of integers: " + math.multiply(5, 4));
        System.out.println("Multiplication of doubles: " + math.multiply(5.5, 4.4));
    }
}
