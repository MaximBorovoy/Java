package Thread;

import java.util.concurrent.Exchanger;

public class ExchangerExample {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger();

        new Mike(exchanger);
        new Form(exchanger);
    }

    static class Mike extends Thread {
        Exchanger<String> exchanger;

        public Mike(Exchanger<String> exchanger) {
            this.exchanger = exchanger;
            start();
        }

        @Override
        public void run() {
            try {
                exchanger.exchange("Hi, my name is Mike");
                sleep(1000);
                exchanger.exchange("I'm 20");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }

    static class Form extends Thread {
        Exchanger<String> exchanger;

        public Form(Exchanger<String> exchanger) {
            this.exchanger = exchanger;
            start();
        }

        @Override
        public void run() {
            try {
                System.out.println(exchanger.exchange(null));
                System.out.println(exchanger.exchange(null));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
