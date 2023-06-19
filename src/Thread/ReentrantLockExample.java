package Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    public static void main(String[] args) throws InterruptedException {

        NewResource resource = new NewResource();
        resource.i = 5;
        resource.j = 5;
        NewMyThread newMyThread = new NewMyThread();
        newMyThread.setName("one");
        NewMyThread newMyThread1 = new NewMyThread();
        newMyThread.resource = resource;
        newMyThread1.resource = resource;
        newMyThread.start();
        newMyThread1.start();
        newMyThread.join();
        newMyThread1.join();
        System.out.println(resource.i);
        System.out.println(resource.j);
    }
}


class NewMyThread extends Thread {
    NewResource resource;


    @Override
    public void run() {
        resource.changeI();
        resource.changeJ();
    }
}

class NewResource {
    int i;
    int j;
    Lock locker = new ReentrantLock();


    public void changeI() {
        locker.lock();
        int i = this.i;
        if (Thread.currentThread().getName().equals("one"))
            Thread.yield();
        i++;
        this.i = i;
        System.out.println("thread " + Thread.currentThread().getName() + " has finished changeI()");
    }

    public void changeJ() {
        int j = this.j;
        if (Thread.currentThread().getName().equals("one"))
            Thread.yield();
        j++;
        this.j = j;
        locker.unlock();
        System.out.println("thread " + Thread.currentThread().getName() + " has finished changeJ()");
    }
}
