class PriorityExample extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Priority: " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        PriorityExample t1 = new PriorityExample();
        PriorityExample t2 = new PriorityExample();

        t1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        t2.setPriority(Thread.MAX_PRIORITY); // Priority 10

        t1.start();
        t2.start();
    }
}
