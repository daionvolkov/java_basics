package MultiStreams.Ex2;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread[] threads = new Thread[100];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    counter.increment();
                }
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (counter.getCount() == 100000) {
            System.out.println("Count is equal to 100000");
        } else {
            System.out.println("Count is NOT equal to 100000");
        }
    }
        }


