public class MyMath {
    public static double power(int base, int exponent) {
        int result = 1;
        if (exponent < 0) {
            int exponentpos = Math.abs(exponent);
            for (int i = 1; i <= exponentpos; i++) {
                result = result * base;
            }
            return (double) 1/result;
        } else {
            for (int i = 1; i <= exponent; i++) {
                result = result * base;
            }
            return result;
        }
    }
}