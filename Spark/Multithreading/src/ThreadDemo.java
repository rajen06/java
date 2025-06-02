
 class MyThread extends Thread {
        //task Job
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread " + i + " is running.");
            }
        }

}

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Piyush " + i + " is running.");
        }

    }
}
