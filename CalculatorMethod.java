public class CalculatorMethod {
    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        CalculatorMethod calc = new CalculatorMethod();
        System.out.println("Sum: " + calc.add(10, 20)); // Passing arguments
    }
}
