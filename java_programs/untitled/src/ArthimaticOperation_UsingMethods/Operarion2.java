package ArthimaticOperation_UsingMethods;

public class Operarion2 {
    public static void main(String[] args) {

        double solution = subtraction(15.8 ,20 ,6.66);

        System.out.println(solution);

    }

     //  Write a Java program that subtracts 15.8 from 20 and then multiplies the result by 6.66.

    public static double subtraction ( double number1 , int number2 , double number3 ) {
        double result = (number1 - number2) * number3;
        return result;
    }

}
