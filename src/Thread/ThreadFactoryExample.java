package Thread;

import java.util.concurrent.ThreadFactory;

public class ThreadFactoryExample {
    public static void main(String[] args) {
        ThreadFactory threadFactory = r -> {
            Thread thread = new Thread(r);
            thread.setName("FactoryThread1");
            return thread;
        };
        threadFactory.newThread(new MyRun()).start();


    }

    static class MyRun implements Runnable {

        @Override
        public void run() {
            if (Thread.currentThread().getName().equals("FactoryThread")) {
                try {
                    Thread.currentThread().wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else {
                System.out.println(1);
            }
        }
    }
}
