package Tasks4;

public class exercise1_1 {
    public static void main(String[] args) {
        oddNumbers();
    }
    public static void oddNumbers() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd numbers: " + i);
            }
        }
    }
}