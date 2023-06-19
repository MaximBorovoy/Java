package Thread;

import java.util.Scanner;

public class VolatileExample {
    public static void main(String[] args) {
        NewThread thread = new NewThread();
        thread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        thread.shutDown();

    }

}

class NewThread extends Thread {
    public volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println("Hello from Thread");
 
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutDown() {
        this.running = false;
    }
}
