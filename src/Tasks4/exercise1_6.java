package Tasks4;

public class exercise1_6 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, -3, 7, 4, 5, 4, 3};
        boolean res = findNumber(arr);
        System.out.println(res);
    }


    public static boolean findNumber(int[] arr) {
        for (int i : arr) {
            return i == 1 || i == 3;
        }
        return false;
    }

}
