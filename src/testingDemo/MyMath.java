package testingDemo;

public class MyMath{
    public static int add(int number1, int number2){
        return number1 + number2;
    }

    public static double power(double base, double exp){
        double result = 1.0;
        if(exp < 0){
            for(double i = 0; i < -(exp); i++){
               result = result*(1/base);
            }
            return result;
        }else{
            for(double i = 0; i < exp; i++){
            result = result * base; 
            }
            return result;
        }   
    }
}