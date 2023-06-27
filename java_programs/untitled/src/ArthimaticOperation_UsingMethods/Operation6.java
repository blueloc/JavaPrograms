package ArthimaticOperation_UsingMethods;

public class Operation6 {
    public static void main(String[] args) {

        int solution = multiplies(2,9,7);
        System.out.println(solution);
    }
    //Write a Java program that multiplies 2 by 9 and then subtracts 7 from the result.

    public static int multiplies (int a,int b, int c) {
        int result =(a * b) -c;
        return result;
    }
}
