package DatatypesVariableAndOperators;

public class AreaCalculation {
    public static void main(String[] args) {
        double radius = 7;
        final double PI = 3.14;
        double area = PI * radius * radius;
        System.out.println("Area of the circle: " + area);

        int length = 10, breadth = 5;
        System.out.println("Area of the rectangle: " + (length * breadth));
    }
}
