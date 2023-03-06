package Tasks4;

import java.awt.desktop.AboutEvent;

public class exercise1_5 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, -3, 7, 4, 5, 4, 3};
        boolean isIt =  findNumber(arr);
        System.out.println(isIt);
    }

    public static boolean findNumber(int[] arr) {
        return (arr[0] == 3 && arr[arr.length - 1] == 3);
    }
}
