package ArthimaticOperation_UsingMethods;

public class Operation7 {
    public static void main(String[] args) {
        int solution = divides(50,2,10);
        System.out.println(solution);

    }
    //7.Write a Java program that divides 50 by 2 and then adds 10 to the result.

    public static int divides (int a, int b ,int c) {
        int result = (a / b) + c;
        return result;
    }
}
