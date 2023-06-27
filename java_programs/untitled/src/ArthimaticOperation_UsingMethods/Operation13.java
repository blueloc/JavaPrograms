package ArthimaticOperation_UsingMethods;

public class Operation13 {
    public static void main(String[] args) {

        double solution =average(10.5,4.6,2.8);
        System.out.println("The average of the three numbers is " + solution);

    }
    //13.Write a Java program to find the average of three numbers.

    public static double average ( double a , double b , double c) {
        double result = ( a+b+c)/2;
        return result;
    }
}
