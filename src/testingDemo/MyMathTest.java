package testingDemo;

/**
 * Utility class for math operations.
 */

 public class MyMathTest {
 
    /*
     * Returns the sum of two integers.
     * @author: Joshua Yin
     */

     public static void main (String[] args) {
        System.out.println(add(1, 2));
     }

     /*
      * Returns the sum of two integers.
        * @param a the first integer
        * @param b the second integer   
        * @return the sum of a and b
      */

    public static int add(int a, int b) {
        return a + b;
    }
 }