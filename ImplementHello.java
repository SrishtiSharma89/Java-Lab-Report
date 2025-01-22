//code inside package
package Mypackage;

public class Hello {
    public void printMessage() {
        System.out.println("Hello from the package!");
    }
}

//code inside file which is going to import data from package
import Mypackage.Hello;

public class ImplementHello {
    public static void main(String[] args) {
        Hello msg = new Hello();
        msg.printMessage();
    }
}
