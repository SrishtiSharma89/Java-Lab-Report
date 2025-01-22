public class DisplayingDetails {
    void show(int number) {
        System.out.println("The number is: " + number);
    }

    void show(String message) {
        System.out.println("The message is: " + message);
    }

    public static void main(String[] args) {
        DisplayingDetails display = new DisplayingDetails();
        display.show(42); // Calls method with int parameter
        display.show("I am learning Java."); // Calls method with String parameter
    }
}
