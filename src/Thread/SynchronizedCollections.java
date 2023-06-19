package Thread;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollections {
    public static void main(String[] args) {
        NameList nameList = new NameList();
        nameList.add("first");
        class MyThread extends Thread {
            @Override
            public void run() {
                System.out.println(nameList.remove());
            }
        }
        MyThread thread = new MyThread();
        thread.setName("one");
        thread.start();
        new MyThread().start();
    }

    static class NameList {
        private List<String> list = Collections.synchronizedList(new ArrayList<>());
        
        public void add(String name) {
            list.add(name);
        }

        public synchronized String remove() {
            if (list.size() > 0) {
                if (Thread.currentThread().getName().equals("one")) {
                    Thread.yield();
                }
                return (String) list.remove(0);
            }
            return "-1";
        }
    }
}






