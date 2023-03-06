package Tasks4;

public class exercise1_2 {
    private static String resultDevFive = "";
    private static String resultDevThree = "";
    private static String resultDevThreeFive = "";

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                resultDevThree += " " + i;
            }
            if (i % 3 != 0 && i % 5 == 0) {
                resultDevFive += " " + i;
            }
            if (i % 3 == 0 && i % 5 == 0) {
                resultDevThreeFive += " " + i;
            }
        }
        System.out.println("Делится на 3: " + resultDevThree);
        System.out.println("Делится на 5: " + resultDevFive);
        System.out.println("Делится на 3 и на 5: " + resultDevThreeFive);
    }
}
