package MultiStreams.Ex3;

import java.util.ArrayList;

public class NamedStreams extends Thread {
    private String name;

    public NamedStreams(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                System.out.println(name);
                notify();
                try {
                    Thread.sleep(300);
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


