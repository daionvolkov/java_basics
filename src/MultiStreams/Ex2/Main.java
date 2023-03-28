package MultiStreams.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        counter.increment();
                    }
                }
            });
            thread.start();
        }
        System.out.println(counter.getCount());
    }
}


