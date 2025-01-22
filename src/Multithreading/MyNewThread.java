package Multithreading;

//program to demonstrate multithreading with sleep
public class MyNewThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);
            try {
                Thread.sleep(2000); // Pause for 2000 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        MyNewThread thread = new MyNewThread();
        thread.start();
    }
}
