package Tasks4;

public class exercise2_1 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 10};
        String res =  ifItSort(arr);
        System.out.println(res);

    }
    public static String ifItSort(int [] arr) {
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] <= arr[i + 1]) {
                count++;
            } else {
                count--;
            }
        }
        if (count == arr.length-1) {
           return "OK";
        } else {
            return "Please, try again";
        }
    }
}
