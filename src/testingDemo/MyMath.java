package testingDemo;

/**
 * Utility class for basic mathematical operations.
 */

public class MyMath {

    /**
     * Adds two numbers
     * 
     * @param number1 The first integer
     * @param number2 The second integer
     * @return The sum of the integers
     */
    public static int add (int number1, int number2) {
        return number1 + number2;
    }

    public static double power (int base, int exponent) {

        double result = 1;
        
        if (exponent >= 0) {
            
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
        }

        else if (exponent < 0) {

            for (int i = 0; i > exponent; i--) {
                result *= (1/base);
            }
        }

        return result;
    }
}