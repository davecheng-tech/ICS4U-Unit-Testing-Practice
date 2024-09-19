package testingDemo;

import java.io.IOException;

public class MyMath {

    public static void main(String[] args) throws IOException{

    }

    /**
     * Adds two integers togeher
     * @param number1
     * @param number2
     * @return sum 
     * 
     * @author Gordon
     */

    public static int add(int number1, int number2){
        return number1 + number2; 
    }

    public static int power(int base, int exponent){

        int temp = 1; 
        for(int i = 0 ; i < exponent; i++){
            temp *= base; 
        }
        return temp; 
    }
}