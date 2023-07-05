package ifConditionTest;

import java.util.Scanner;

   public class ifConditionTest {
    public static void main(String[] args) {
     /*   Scanner result = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = result.nextInt();
        if (number % 2 == 0){
            System.out.println("it is a even number");
        }  else {
            System.out.println("it is a odd number");
        }   */


     /*   Scanner result= new Scanner(System.in);
        System.out.println("Enter a number");
        int number = result.nextInt();
        if (number > 0) {
            System.out.println("THis is positive");
        } else if ( number < 0 ) {
            System.out.println("This is negative");
        } else {
            System.out.println("This is zero");
        }   */


     /*   Scanner percentage = new Scanner(System.in);
        System.out.println("ENTER the Marks");
        int number = percentage.nextInt();
        if (number >= 90) {
            System.out.println("your grade=A ");
        }  else if (number >=80 && number <90) {
            System.out.println("your grade=B");
        }  else if (number >=70 && number <90 && number <80) {
            System.out.println("your grade=C");
        } else if (number >=35 && number < 70) {
            System.out.println("your grade=D");
        }  else {
            System.out.println("your grade= fail");
        }   */

     /*   Scanner result = new Scanner(System.in);
        System.out.println("Enter the Alphabets");
        char alphabet = result.next().charAt(0);
        if ((alphabet >= 'a' && alphabet <= 'z') || (alphabet >='A' && alphabet <= 'Z') ) {
            System.out.println("This is alphabet = "+ alphabet );
        } else {
            System.out.println("THis is invalid alphabet = " + alphabet );
        }   */

        Scanner result = new Scanner(System.in);
        System.out.println("Print a Letter");
        char alphabet = result.next().charAt(0);
        if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' ||alphabet == 'o' || alphabet == 'u'
        || alphabet == 'A' || alphabet == 'E' || alphabet == 'I' ||alphabet == 'O' || alphabet == 'U' ) {
            System.out.println("These are ovals = " + alphabet);
        }  else  {
            System.out.println("THis is consonant");
        }











    }
}
