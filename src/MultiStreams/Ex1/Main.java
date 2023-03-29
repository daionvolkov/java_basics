package MultiStreams.Ex1;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            TenStreams thread = new TenStreams();
            System.out.println("Thread " + i + " " + thread.getState());
            thread.start();
            System.out.println("Thread " + i + " started");
        }
    }
}