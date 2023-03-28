package MultiStreams.Ex1;

public class TenStreams extends Thread {

    @Override
    public void run() {
        System.out.println("Thread starting");
        for (int i = 0; i <= 100; i++) {
            System.out.println("Element: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
                return;
            }
        }
        System.out.println("Thread finished");
    }
}
