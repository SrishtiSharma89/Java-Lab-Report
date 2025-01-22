class Parent {
    void display() {
        System.out.println("This is parent class.");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("This is child class.");
    }
}

public class SingleInheritanceEx {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display(); // Parent class method
        obj.show();    // Child class method
    }
}

