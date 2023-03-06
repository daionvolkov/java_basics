package Tasks4;

public class exercise2_4 {

    public static void main(String[] args) {

        System.out.println(findUniqueNumber());
    }

    public static int findUniqueNumber() {
        int[] array3 = new int[]{1, 2, 3, 1, 2, 4};
        //Arrays.sort(array3);
        for (int i = 0; i < array3.length; i++) {
            boolean flag = true;
            for (int j = 1; j < array3.length; j++) {
                if (array3[i] == array3[j] && i != j) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return array3[i];
            }
        }
        return 0;
    }
}
