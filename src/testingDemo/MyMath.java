package testingDemo;

public class MyMath {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static double power(int base, int exponent) {
        double result = 1.0;
        
        for (int i = 0; i < Math.abs(exponent); i++) {
            result *= base;
        }

        if (exponent < 0) {
            return 1.0 / result;
        } else {
            return result;
        }
    }
    
}
