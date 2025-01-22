class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            throw new MyException("Custom exception occurred");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
