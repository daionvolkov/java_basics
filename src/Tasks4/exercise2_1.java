package Tasks4;

public class exercise2_1 {
    public static void main(String[] args) {
        int[] numbers = {8, 3, 10};
        int count = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                count++;
            } else {
                count--;
            }
        }
        if (count == numbers.length) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
    }
}
