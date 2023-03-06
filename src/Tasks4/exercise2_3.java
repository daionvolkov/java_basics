package Tasks4;

import java.util.Arrays;

public class exercise2_3 {
    public static void main(String[] args) {
        arrayChangeNumsPlace();
    }
    public static void arrayChangeNumsPlace() {
        int[] array1 = new int[]{5, 6, 7, 2};
        int[] array2 = new int[array1.length];
        array2[0] = array1[array1.length - 1];
        System.arraycopy(array1, 1, array2, 1, array1.length - 1 - 1);
        array2[array1.length - 1] = array1[0];
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
