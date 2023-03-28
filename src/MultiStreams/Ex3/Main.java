package MultiStreams.Ex3;

public class Main {
    public static void main(String[] args) {
        while (true) {
            NamedStreams stream1 = new NamedStreams("FirstStream");
            NamedStreams stream2 = new NamedStreams("SecondStream");
            stream1.start();
            stream2.start();
        }

    }

}
