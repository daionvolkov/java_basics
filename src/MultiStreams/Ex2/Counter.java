package MultiStreams.Ex2;

public class Counter extends Thread{
    int count = 0;

    public void increment() {
        count = count + 1;
    }
    public int getCount() {
        return count;
    }

    @Override
    public void run() {
       for(int i=0; i<10; i++) {
           try {
               increment();
           } catch (Exception ex) {
               System.out.println(ex.getMessage());
           }
       }
        increment();
        System.out.println(getCount());
    }
    public void printInfo() {
        System.out.println(getCount());
    }
}

