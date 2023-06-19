package Thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TryLockExample {
    static Lock lock = new ReentrantLock();
    static Condition condition = lock.newCondition();
    static int account;

    public static void main(String[] args) throws InterruptedException {
        new TryLockThread().start();
        new TryLockThread1().start();
        new AccountMinus().start();
        new AccountPlus().start();
    }


    static class TryLockThread extends Thread {


        @Override
        public void run() {
            lock.lock();
            System.out.println(getName() + " start working");

            try {
                sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + " stop working");
            lock.unlock();
            System.out.println(getName() + " lock is released");
        }
    }

    static class TryLockThread1 extends Thread {
        @Override
        public void run() {
            System.out.println(getName() + " begin working");
            while (true) {
                if (lock.tryLock()) {
                    System.out.println(getName() + " working");
                    break;
                } else {
                    System.out.println(getName() + " waiting");
                }
            }
        }
    }

    static class AccountPlus extends Thread {
        @Override
        public void run() {
            lock.lock();
            account += 10;
            condition.signal();
            lock.unlock();
        }
    }

    static class AccountMinus extends Thread {
        @Override
        public void run() {
            if (account < 10) {
                try {
                    lock.lock();
                    System.out.println("account before: " + account);
                    condition.await();
                    System.out.println("account after: " + account);
                    lock.unlock();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            account -= 10;
            System.out.println("Account = " + account);
        }
    }
}