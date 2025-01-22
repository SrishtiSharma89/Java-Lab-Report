//code inside package
//class 1:-
package Shapes;

public class CircleShape {
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}
//class 2:-
package Shapes;

public class SquareShape {
    public void draw() {
        System.out.println("Drawing a square.");
    }
}
//code for the file to access above two classes from shapes package
import Shapes.CircleShape;
import Shapes.SquareShape;

public class AccessingMultipleClassFromPackage {
    public static void main(String[] args) {
        CircleShape circle = new CircleShape();
        SquareShape square = new SquareShape();
        circle.draw();
        square.draw();
    }
}
