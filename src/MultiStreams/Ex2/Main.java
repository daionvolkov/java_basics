package MultiStreams.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Counter count = new Counter();
        Thread[] threads = new Thread[100];
        for (int i = 0; i < 100; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    synchronized (count) {
                        count.increment();
                    }
                }
            });
            threads[i].start();
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

        }
        System.out.println(count.getCount());
    }
}


