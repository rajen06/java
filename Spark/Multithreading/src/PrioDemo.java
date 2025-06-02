public class PrioDemo {
    public static void main(String[] args) {

        Thread t1 = new Thread(new MyRunnable(), "t1");
        Thread t2 = new Thread(new MyRunnable(), "t2");
        Thread t3 = new Thread(new MyRunnable(), "t3");

        System.out.println("main thread priority "+Thread.currentThread());
        System.out.println("Priority of t1 is "+t1.getPriority());

        t1.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Priority of t1 after is "+t1.getPriority());
    }
}
