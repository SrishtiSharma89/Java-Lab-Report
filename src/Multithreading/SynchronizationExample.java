package Multithreading;

class Printer {
    synchronized void printMessage(String message) { // Synchronized method
        System.out.print("[");
        try {
            Thread.sleep(500); // Simulating delay
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(message + "]");
    }
}

class MessageThread extends Thread {
    Printer printer;
    String message;

    MessageThread(Printer printer, String message) {
        this.printer = printer;
        this.message = message;
    }

    public void run() {
        printer.printMessage(message);
    }
}

public class SynchronizationExample {
    public static void main(String[] args) {
        Printer printer = new Printer(); // Shared resource

        // Creating threads with the shared Printer object
        MessageThread t1 = new MessageThread(printer, "Hello");
        MessageThread t2 = new MessageThread(printer, "World");

        t1.start();
        t2.start();
    }
}