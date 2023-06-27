package ArthimaticOperation_UsingMethods;

public class Operation11 {
    public static void main(String[] args) {

        double solution = product(13.5,5);
        System.out.println(solution);

    }
    // 11.Write a Java program to calculate the product of two numbers.

    public static double product (double a, double b) {
        double result = (a*b);
        return result;
    }
}
