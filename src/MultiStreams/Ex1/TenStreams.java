package MultiStreams.Ex1;

public class TenStreams extends Thread {

    @Override
    public void run() {
        System.out.println("Thread starting");
        for (int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + ", Element: " + i);
        }
        System.out.println(Thread.currentThread().getName() + " Thread finished");
    }
}
