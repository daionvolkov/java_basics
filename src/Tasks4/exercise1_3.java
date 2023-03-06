package Tasks4;

import java.util.Scanner;

public class exercise1_3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 3;
        boolean res = sumNumbers(a, b, c);
        System.out.println(res);
    }

    public static boolean sumNumbers(int a, int b, int c) {

        return a + b == c;
    }
}
