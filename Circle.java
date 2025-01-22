

class Circle {
    double radius;
    double area;

    // Constructor to initialize the radius and calculate area
    Circle(double radius) {
        this.radius = radius;
        area = Math.PI * radius * radius;
    }

    // Method to display circle details
    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
    }
}
