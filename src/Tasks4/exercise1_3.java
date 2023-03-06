package Tasks4;

import java.util.Scanner;

public class exercise1_3 {
    public static void main(String[] args) {
        sumNumbers();
    }
    public static void sumNumbers() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первное число: ");
        int a = scan.nextInt();
        System.out.println("Введите второе число: ");
        int b = scan.nextInt();
        System.out.println("Введите третье число: ");
        int c = scan.nextInt();
        System.out.println(a + b == c);
    }
}
