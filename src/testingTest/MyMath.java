package testingTest;

public class MyMath {
    public static int add(int number1, int number2){
        return number1 + number2;
    }

    public static double power(double base, double exponent) {
        if (exponent == 0) return 1;
        if (base == 0 && exponent < 0) throw new ArithmeticException("Illegal math, go back to school");

        double result = 1.0;
        double absExponent = Math.abs(exponent);

        for (int i = 0; i < absExponent; i++) {
            result *= base;
        }

        return exponent < 0 ? 1.0 / result : result;
    }
}