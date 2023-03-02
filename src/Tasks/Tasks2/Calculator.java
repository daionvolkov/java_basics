package Tasks.Tasks2;

public class Calculator {
    public static double addNums(double a, double b) {
        return a + b;
    }
    public static long addNums(long a, long b) {
        return a + b;
    }
    public static int addNums(int a, int b) {
        return a + b;
    }
    public static double divNums(double a, double b) {
        if (b != 0) {
            return a / b;
        }
        return 0;
    }
    public static double divNums(long a, long b) {
        if (b != 0) {
            return (double)(a / b);
        }
        return 0;
    }
    public static double divNums(int a, int b) {
        if (b != 0) {
            return (double)(a / b);
        }
        return 0;
    }
    public static double multNums(double a, double b) {
        return a * b;
    }
    public static long multNums(long a, long b) {
        return a * b;
    }
    public static int multNums(int a, int b) {
        return a * b;
    }
    public static double subtrNums(double a, double b) {
        return a - b;
    }
    public static long subtrNums(long a, long b) {
        return a - b;
    }
    public static int subtrNums(int a, int b) {
        return a - b;
    }
}
