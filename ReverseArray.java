import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];//array declaration
        // taking array input
        for (int i=0; i<numbers.length; i++) {
            System.out.print("Enter element "+(i+1)+" :");
            numbers[i] = sc.nextInt();
        }
        //displaying array
        System.out.println("Original Array: ");
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        //displaying reverse of array
        System.out.println("\nReversed Array:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        sc.close();
    }
}
