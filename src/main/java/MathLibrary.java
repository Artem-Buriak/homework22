public class MathLibrary {
    public static double plus(double a, double b) {
        return a + b;
    }
    public static double plus(int a, int b) {
        return a + b;
    }
    public static double plus(int a, int b, int c) {
        return a + b + c;
    }
    public static double minus(double a, double b) {
        return a - b;
    }
    public static double minus(int a, int b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }
}