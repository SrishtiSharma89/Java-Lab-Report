class Rectangle {
    double length;
    double breadth;

    // Default constructor
    Rectangle() {
        length = 5;
        breadth = 4;
    }

    // Parameterized constructor
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and display area
    void area() {
        double area = length * breadth;
        System.out.println("Area: " + area);
    }
}

public class ParameterizedNDefaultConstructor {
    public static void main(String[] args) {
        // Using default constructor
        Rectangle rect1 = new Rectangle();
        rect1.area();

        // Using parameterized constructor
        Rectangle rect2 = new Rectangle(7, 3);
        rect2.area();
    }
}
