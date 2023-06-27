package ArthimaticOperation_UsingMethods;

public class Operation9 {
    public static void main(String[] args) {
        int solution = multiplies(4,6,15);
        System.out.println(solution);
    }
    // 9.Write a Java program that multiplies 4 by 6 and then subtracts 15 from the result.

    public static int multiplies (int a ,int b , int c) {
        int result = (a*b) -c;
        return result;

    }
}
