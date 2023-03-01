package Tasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");

        double res1 = (46 + 10) * (10 / 3.0);
        System.out.println(res1);
        int res2 = (46 + 10) * (10 / 3);
        System.out.println(res2);

        int number = 10500;
        double res3 = (number / 10.0) / 10;
        System.out.println(res3);

        float x = 3.6f;
        float y = 4.1f;
        float z = 5.9f;
        float res4 = x * y * z;
        System.out.println(res4);


        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        if (b % 2 != 0) {
            System.out.println("Нечетное");
        } else if (b > 100) {
            System.out.println("Выходит за пределы диапазона");
        } else {
            System.out.println("Четное");
        }
    }
}
