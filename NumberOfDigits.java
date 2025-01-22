import java.util.*;
public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number whose number of digits have to be calculated: ");
        int n = sc.nextInt();
        int count=0;
        int m = n;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println("The number of digits in "+m+" is "+count+".");
        sc.close();
    }
}
