package BasicStructureOfJava;

public class SwappingNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int temp;
        System.out.println("Before swapping: \na = "+a+" & b = "+b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: \na = "+a+" & b = "+b);
    }
}
