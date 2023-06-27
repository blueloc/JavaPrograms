package ArthimaticOperation_UsingMethods;

public class Operation1 {
    public static void main(String[ ] args) {
           double  result = arthimaticCalculation(3,4.1,7);
        System.out.println(result);
    }

     // Write a Java program that multiplies 3 by 4.1 and adds 7 to the result.

    public static double  arthimaticCalculation (int firstNumber , double secondNumber , int thirdNumber ) {
      double result = ( firstNumber * secondNumber ) + thirdNumber ;
    //  return result;
        return result;
    }
}
