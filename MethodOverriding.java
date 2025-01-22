class Animal {
    void sound() {
        System.out.println("Animals make sounds.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dogs bark.");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); // Overridden method
    }
}
