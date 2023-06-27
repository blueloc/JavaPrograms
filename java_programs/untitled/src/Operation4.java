public class Operation4 {
    public static void main(String[] args) {
        int solution = addition(8,2,5);
        System.out.println(solution);

    }
    //Write a Java program that adds 8 to 2 and then multiplies the result by 5.

    public static int addition ( int num1,int num2, int num3) {
      int  result = (num1 + num2) *num3;
      return result;
    }
}
