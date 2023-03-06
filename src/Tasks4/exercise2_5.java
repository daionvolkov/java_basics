package Tasks4;

import java.util.Arrays;



public class exercise2_5 {
    public static void main(String[] args) {
        int[] arr = {3, 7, 12, 76, 3, 0, 544, 9};
        int[] result = mergeSort(arr);

        System.out.println(Arrays.toString(result));

    }

    public static int[] mergeSort(int[] arr) {
        System.out.println(Arrays.toString(arr));

        if (arr.length < 2) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = new int[mid];

        int[] right;

        if (arr.length % 2 == 0) {
            right = new int[mid];
        } else {
            right = new int[mid + 1];
        }

        for (int i = 0; i < left.length; i++) {
            left[i] = arr[i];
        }

        for (int i = 0; i < right.length; i++) {
            right[i] = arr[mid + i];
        }

        left = mergeSort(left);
        right = mergeSort(right);

        return mergeParts(left, right);

    }

    private static int[] mergeParts(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftPointer = 0;
        int rightPointer = 0;
        int resultPointer = 0;

        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer] < right[rightPointer]) {
                    result[resultPointer++] = left[leftPointer++];
                } else {
                    result[resultPointer++] = right[rightPointer++];
                }
            } else if (leftPointer < left.length) {
                result[resultPointer++] = left[leftPointer++];

            } else if (rightPointer < right.length) {
                result[resultPointer++] = right[rightPointer++];
            }
        }
        return result;
    }
}
