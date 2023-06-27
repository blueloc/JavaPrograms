package ArthimaticOperation_UsingMethods;

public class Operation8 {
    public static void main(String[] args) {

        int solution = subtracts(12,20,3);
        System.out.println(solution);
    }
    //8.Write a Java program that subtracts 12 from 20 and then multiplies the result by 3.

    public static int subtracts (int a ,int b ,int c) {
        int result =(a-b ) *c;

        return result;
    }
}
