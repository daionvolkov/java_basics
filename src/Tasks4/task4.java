package Tasks4;

import java.util.Arrays;
import java.util.Scanner;

public class task4 {
    private static String resultDevFive = "";
    private static String resultDevThree = "";
    private static String resultDevThreeFive = "";

    public static void main(String[] args) {

//1
//        for (int i = 1; i < 100; i++) {
//            if (i % 2 != 0) {
//                System.out.println("Odd numbers: " + i);
//            }
//        }
//2
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 != 0) {
//                resultDevThree += " "+i;
//            }
//            if (i % 3 != 0 && i % 5 == 0) {
//                resultDevFive += " "+i;
//            }
//            if (i % 3 == 0 && i % 5 == 0) {
//                resultDevThreeFive+= " "+i;
//            }
//        }
//        System.out.println("Делится на 3: " +resultDevThree);
//        System.out.println("Делится на 5: " +resultDevFive);
//        System.out.println("Делится на 3 и на 5: " +resultDevThreeFive);
//3
        Scanner scan = new Scanner(System.in);
//          System.out.println("Введите первное число: ");
//          int a = scan.nextInt();
//          System.out.println("Введите второе число: ");
//          int b = scan.nextInt();
//          System.out.println("Введите третье число: ");
//          int c = scan.nextInt();
//          System.out.println(a+b==c);

//4

//        System.out.println("Введите первное число: ");
//        a = scan.nextInt();
//        System.out.println("Введите второе число: ");
//        b = scan.nextInt();
//        System.out.println("Введите третье число: ");
//        c = scan.nextInt();
//        System.out.println(a<b && b<c);

//5
//        int[] arr= new int[] {3, -3, 7, 4, 5, 4, 3} ;
//        System.out.println(arr[0] == 3 && arr[arr.length-1] ==3);
//6
//        for (int i:arr) {
//            System.out.println(i == 1 | i == 3);
//        }

//Part2
//1
//        int[] numbers = {8, 3, 10};
//        int count = 0;
//        for (int i = 0; i < numbers.length - 1; i++) {
//            if (numbers[i] > numbers[i + 1]) {
//                count++;
//            } else {
//                count--;
//            }
//        }
//        if (count == numbers.length) {
//            System.out.println("OK");
//        } else {
//            System.out.println("Please, try again");
//        }
//2
//        System.out.printf("Enter array length: ");
//        int arrLen = scan.nextInt();
//        int[] array = new int[arrLen];
//        for (int i = 0; i < arrLen; i++) {
//            System.out.printf("Enter element" + " " + (i + 1) + ": ");
//            array[i] = scan.nextInt();
//        }
//        System.out.println("Array length: " + arrLen);
//        System.out.println("Numbers of array: ");
//        for (int i : array) {
//            System.out.println(i);
//        }
//        System.out.println("Result: " + Arrays.toString(array));

//3
        int[] array1 = new int[]{
            5, 6, 7, 2
        };
        int[] array2 = new int[array1.length];
        array2[0] = array1[array1.length-1];
        System.arraycopy(array1, 1, array2, 1, array1.length - 1 - 1);
        array2[array1.length-1] = array1[0];

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

    }

}
