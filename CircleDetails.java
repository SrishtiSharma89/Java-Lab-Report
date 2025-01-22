public class CircleDetails {
    double radius;

    void setRadius(double r) {
        radius = r;
    }

    double calculateArea() {
        return 3.14 * radius * radius;
    }

    double calculateCircumference() {
        return 2 * 3.14 * radius;
    }

    public static void main(String[] args) {
        CircleDetails circle = new CircleDetails();
        circle.setRadius(7.0); // Setting radius

        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());
    }
}
