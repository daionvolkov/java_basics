package Tasks.Tasks2;

public class Calculator {
    public static double Addition(double a, double b) {
        double sum = a + b;
        return sum;
    }

    public static long Addition(long a, long b) {
        long sum = a + b;
        return sum;
    }

    public static int Addition(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static double Division(double a, double b) {
        if (b != 0) {
            double div = a / b;
            return div;
        }
        return 0;
    }
    public static long Division(long a, long b) {
        if (b != 0) {
            long div = a / b;
            return div;
        }
        return 0;
    }
    public static int Division(int a, int b) {
        if (b != 0) {
            int div = a / b;
            return div;
        }
        return 0;
    }
    public static double Multiplication(double a, double b) {
            double multy = a * b;
            return multy;
    }
    public static long Multiplication(long a, long b) {
        long multy = a * b;
        return multy;
    }
    public static int Multiplication(int a, int b) {
        int multy = a * b;
        return multy;
    }
    public static double Subtraction(double a, double b) {
        double sub = a - b;
        return sub;
    }
    public static long Subtraction(long a, long b) {
        long sub = a - b;
        return sub;
    }
    public static int Subtraction(int a, int b) {
        int sub = a - b;
        return sub;
    }
}
