package ArraysStringsAndControlStructures;

public class LargestInArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 5, 15, 30};
        int largest = numbers[0];

        for (int i=0;i<numbers.length;i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Largest Number: " + largest);
    }
}
