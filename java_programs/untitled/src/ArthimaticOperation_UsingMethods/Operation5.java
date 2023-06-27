package ArthimaticOperation_UsingMethods;

public class Operation5 {
    public static void main(String[] args) {
        double solution = subtracts(6,15.6,3);
        System.out.println(solution);

    }
    // Write a Java program that subtracts 6 from 15.6 and then divides the result by 3.

    public static double subtracts ( int a, double b,int c) {
        double result = (a-b) / c;
        return result;
    }
}
