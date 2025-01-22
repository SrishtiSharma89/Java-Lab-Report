class Parents {
    void display() {
        System.out.println("This is parent class.");
    }
}

class Childs extends Parents {
    void show() {
        System.out.println("This is child class.");
    }
}

public class SingleInheritanceEx {
    public static void main(String[] args) {
        Childs obj = new Childs();
        obj.display(); // Parent class method
        obj.show();    // Child class method
    }
}

