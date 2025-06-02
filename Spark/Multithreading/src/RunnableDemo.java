class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
    MyRunnable r = new MyRunnable();
    Thread t = new Thread(r);
    t.start();
    }
}
