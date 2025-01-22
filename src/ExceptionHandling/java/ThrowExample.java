package ExceptionHandling.java;

public class ThrowExample {
    static void validate(int age) {
        if (age < 18)
            throw new ArithmeticException("Not eligible to vote");
        else
            System.out.println("Welcome to voting!");
    }

    public static void main(String[] args) {
        validate(16);
    }
}
