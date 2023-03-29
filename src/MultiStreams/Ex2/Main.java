package MultiStreams.Ex2;

import java.util.concurrent.CountDownLatch;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        CountDownLatch latch = new CountDownLatch(100);
        Thread[] threads = new Thread[100];

        for (int i = 0; i < 100; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    synchronized (counter) {
                        counter.increment();
                    }
                }
                latch.countDown();
            });
            threads[i].start();
        }
        latch.await();
        System.out.println( counter.getCount());
    }
}


