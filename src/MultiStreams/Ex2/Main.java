package MultiStreams.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        for (int i = 0; i < 100; i++) {
            Thread threads = new Thread(new Runnable() {
                @Override
               public void run() {
                    for (int j = 0; j < 1000; j++) {
                        counter.increment();
                    }
                }
            });
            threads.run();
        }
        System.out.println(counter.getCount());
    }
}


