package Thread;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariable {
    static AtomicInteger atomicInteger = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        for (int j = 0; j < 10_000; j++) {
            new MyThread().start();
        }
        Thread.sleep(1000);
        System.out.println(atomicInteger.get());
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            atomicInteger.incrementAndGet();
        }
    }
}
