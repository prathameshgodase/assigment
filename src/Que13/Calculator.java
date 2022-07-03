package Que13;

public class Calculator {

    public static int addtion(int a,int b) {
        int result;
        result=a+b;
        return result;
        }
    public static int subtraction(int a,int b) {
        int result;
        result=a-b;
        return result;
        }
    public static int multiplication(int a,int b) {
        int result;
        result=a*b;
        return result;
        }

    public static double  division(double a,double b) throws ArithmeticException{
        double result;
        if(a>0 &&b>0) {

    return    result=a/b;
        }else {
        return 0;
    }


        }

    public static double  squareroot(int a) {
        double result;
        return result=Math.sqrt(a);
        }
    public static double  power(int a,int b) {
        double result;
        if(a>0 && b>0) {

        return result=Math.pow(a, b);
        }else {
            return 0;
        }

        }
    public static double  modulus(int a,int b) {
        double result;
        return result=a%b;
        }
    public  static double cuberoot(int a) {
        double result;
        if(a>0) {
            return result= Math.cbrt(a);
        }
        else {
            return 0;
        }
    }
}
