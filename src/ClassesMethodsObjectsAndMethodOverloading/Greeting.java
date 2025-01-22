package ClassesMethodsObjectsAndMethodOverloading;

public class Greeting {
    void sayHello() {
        System.out.println("Hello, welcome to Java!");
    }

    public static void main(String[] args) {
        Greeting greet = new Greeting(); // Creating an object
        greet.sayHello(); // Calling the method
    }
}
