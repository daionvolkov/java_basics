package Tasks4;

import java.util.Arrays;
import java.util.Scanner;

public class exercise2_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int arrLen = scan.nextInt();
        int[] array = new int[arrLen];
        for (int i = 0; i < arrLen; i++) {
            System.out.printf("Enter element" + " " + (i + 1) + ": ");
            array[i] = scan.nextInt();
        }
        System.out.println("Array length: " + arrLen);
        System.out.println("Numbers of array: ");
        for (int i : array) {
            System.out.println(i);
        }
        System.out.println("Result: " + Arrays.toString(array));
    }
}
