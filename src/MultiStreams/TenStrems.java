package MultiStreams;

public class TenStrems implements Runnable {

    @Override
    public void run() {
        for(int i=0; i<101; i++) {
            System.out.println("Element:" + i);

        }
    }
}
