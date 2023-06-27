public class Operation3 {
    public static void main(String[] args) {

        double solution = division(100.3,5,2.5);
        System.out.println(solution);

    }
    // Write a Java program that divides 100.3 by 5 and then adds 2.5 to the result.

    public static double division ( double num1 , int num2 , double num3) {
        double result = (num1 / num2 ) + num3;

        return result;
    }

}
