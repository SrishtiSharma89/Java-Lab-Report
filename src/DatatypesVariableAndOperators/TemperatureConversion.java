package DatatypesVariableAndOperators;

import java.util.*;
public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Celsius to Fahrenheit: " + fahrenheit);
        sc.close();
    }
}
