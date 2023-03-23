package MultiStreams;

public class Main {
    public static void main(String[] args) {
        for(int i=0; i<11; i++) {
            Thread obj = new Thread(new TenStrems());
            obj.start();
        }


    }
}
