package calculation_programs;

public class MixedOperations {
    public static void main(String[] args) {

     //   6.	Mixed Operations: Write a Java program that performs the following operations: Multiply 5 by 2, add 10 to the result,
       //         subtract 4 from the previous result, and finally divide the result by 3.


        int num1 = 5;
        int num2 = 2;
        int num3 = 10;
        int num4 = 4;
        int num5 = 3;
        int num6 = (((num1 * num2) + num3) -num4 ) /num5;

        System.out.println(num6);
    }
}
