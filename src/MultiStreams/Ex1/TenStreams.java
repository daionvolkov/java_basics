package MultiStreams.Ex1;

public class TenStreams extends Thread {
    private int id;

    public TenStreams(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Thread " + id + " starting");
        for (int i = 0; i <= 100; i++) {
            System.out.println("Thread " + id + ": " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread " + id + " interrupted");
                return;
            }
        }
        System.out.println("Thread " + id + " finished");
    }
}
