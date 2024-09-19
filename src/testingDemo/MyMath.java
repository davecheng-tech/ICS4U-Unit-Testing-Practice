package testingDemo;

import java.io.IOException;

public class MyMath {

    public static void main(String[] args) throws IOException {

    }

    /**
     * Adds two integers togeher
     * 
     * @param number1
     * @param number2
     * @return sum
     * 
     * @author Gordon
     */

    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    /**
     * Expenential function
     * 
     * @param base
     * @param exponent
     *
     * @return base^exponent
     */

    public static double power(int base, int exponent) {

        double temp = 1;
        if (exponent >= 0) {
            // non-negative exponent
            for (int i = 0; i < exponent; i++) {
                temp *= base;
            }
            return temp;
        } else {
            // negative exponent
            for (int i = 0; i < -exponent; i++) {
                temp /= base;
            }
            return temp;
        }
    }
}