package Thread;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class BlockingQueueExample {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new PriorityBlockingQueue<>();

        new Thread() {
            @Override
            public void run() {
                try {
                    System.out.println("element:" + queue.take() + " is deleted");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                queue.add("string");
            }
        }.start();
    }
}
