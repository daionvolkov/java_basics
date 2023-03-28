package MultiStreams.Ex1;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            TenStreams thread = new TenStreams(i);
            System.out.println("Thread " + i + " created");
            thread.start();
            System.out.println("Thread " + i + " started");
        }
    }
}