package Thread;

import java.util.concurrent.*;

public class StartThreadTest {
    static ExecutorService executorService = Executors.newFixedThreadPool(2);


    public static void main(String[] args) throws InterruptedException, ExecutionException {

        Resource resource = new Resource();
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.schedule(new MyThread(), 3, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
        Resource.j = 6;


        MyThread myThread = new MyThread();
        myThread.setName("Th2");
        MyThread myThread2 = new MyThread();

        executorService.submit(new Runner());
        System.out.println(executorService.submit(new Caller()).get());
        executorService.shutdown();

        //  myThread.setResource(resource);
        //  myThread2.setResource(resource);

        myThread.start();
        myThread2.start();
        myThread.join();
        myThread2.join();

        System.out.println(resource.getI());
        System.out.println(Resource.j);
        Thread thread = new Thread(new Runner());
        thread.start();
    }
}

class Runner implements Runnable {

    @Override
    public void run() {
        System.out.println("runner");
    }
}

class Caller implements Callable<String> {
    @Override
    public String call() throws Exception {

        return "caller";
    }
}

class MyThread extends Thread {
    Resource resource;

    public void setResource(Resource resource) {
        this.resource = resource;
    }


    @Override
    public void run() {
//        for (int i = 0; i < 100; i++) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName() + " Hello from myThread: " + i);
//        }
        // resource.changeI();
        Resource.changeStaticJ();
    }
}

class Resource {
    private int i;
    static int j;


    public static int getJ() {
        return j;
    }

    public synchronized static void setJ(int j) {
        Resource.j = j;
    }

    public int getI() {
        return i;
    }

    public synchronized void setI(int i) {
        this.i = i;
    }

    public synchronized static void changeStaticJ() {
        int j = Resource.j;
        if (Thread.currentThread().getName().equals("Th2"))
            Thread.yield();
        j++;
        Resource.j = j;
    }

    public synchronized void changeI() {
        int i = this.i;
        if (Thread.currentThread().getName().equals("Th2"))
            Thread.yield();
        i++;
        this.i = i;
    }
}
