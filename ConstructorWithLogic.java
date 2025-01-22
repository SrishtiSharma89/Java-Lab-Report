class Circle{
    double radius;
    double area;
    //constructor to initialize radius and calculate area
    Circle(double radius){
        this.radius=radius;
        area = Math.PI*radius*radius;
    }
    //Method to display circle details
    void display(){
        System.out.println("Radius: "+radius);
        System.out.println("Area: "+area);
    }
}
public class ConstructorWithLogic {
    public static void main(String[] args) {
        // Creating object using the constructor
        Circle circle1 = new Circle(7.5);
        circle1.display();
    }
}
