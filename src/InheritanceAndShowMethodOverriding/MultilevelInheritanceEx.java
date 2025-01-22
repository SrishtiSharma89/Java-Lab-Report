package InheritanceAndShowMethodOverriding;

class Grandparent {
    void greet() {
        System.out.println("Hello from Grandparent!");
    }
}

class Parent extends Grandparent {}

class Child extends Parent {}

public class MultilevelInheritanceEx {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.greet(); // Inherited method
    }
}
