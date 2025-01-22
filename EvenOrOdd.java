import java.util.*;
public class EvenOrOdd {
   public static void main(String[] args){
    System.out.print("Enter any number to check if it is even or odd: ");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    if(number%2==0){
        System.out.println("This is even number.");
    }
    else{
        System.out.println("This is odd number.");
    }
    sc.close();
   }
}
