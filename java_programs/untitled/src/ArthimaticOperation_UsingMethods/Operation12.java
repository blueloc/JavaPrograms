package ArthimaticOperation_UsingMethods;

public class Operation12 {
    public static void main(String[] args) {
        double quotient = divide(12,5);
        System.out.println( "The quotient is " + quotient);

    }
    // 12.Write a Java program to divide two numbers and display the quotient.

    public static double divide ( double a, double b ) {
        double result = (a/b);
        return result;

    }
}
