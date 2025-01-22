package InheritanceAndShowMethodOverriding;

class Base {
    final void show() {
        System.out.println("This is a final method.");
    }
}

class Derived extends Base {}

public class FinalMethod {
    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.show(); // Final method from Base
    }
}
