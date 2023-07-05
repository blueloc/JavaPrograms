package test7Part1;

import java.util.Scanner;

/*  public class part3Loops {
      public static void main(String[] args) {

        // 50.Write a program to print numbers from 1 to 10 using a for loop.

          Scanner scan = new Scanner(System.in);
          System.out.println("Enter the numbers: ");
          int num= scan.nextInt();

          for (int i=0;i<=10;i++) {
              System.out.println(i);
          }
      }
}     */


 /*  public class part3Loops  {
       public static void main(String[] args) {

         // 51.Write a program to calculate the sum of numbers from 1 to 100 using a for loop.

           int sum = 0;
           for (int i=1;i<=100;i++) {
               sum+=i;
           }
           System.out.println("sum of numbers from 1 to 100  is " + sum);
       }
}    */


/*  public class part3Loops  {
      public static void main(String[] args) {

          int sum=0;
          for(int i=1;i<=10;i++) {
              sum+=i;
          }
          System.out.println("The sum of 1 to 10 is " +sum);
      }
}    */

/*   public class part3Loops  {
       public static void main(String[] args) {
           // 52.Write a program to print the multiplication table of a given number using a for loop.

           int number=5;
           for (int i=1;i<=20;i++) {
            int result = number * i;
               System.out.println(number + "x" + i + " = " + result);
           }

       }
}         */


/*  public class part3Loops  {
      public static void main(String[] args) {

          int number = 7;
          for (int i=1;i<=10;i++) {
              int result = number * i;
              System.out.println(number + "x" + i + "= " + result);
          }

      }
}          */


/*    public class part3Loops  {
        public static void main(String[] args) {

            // 53.Write a program to find the factorial of a given number using a for loop.



            int i, fact=1;
            int number = 5;
            for ( i=1;i<=number;i++) {
                fact = fact *i;

            }
            System.out.println("Factorial of " + number + " is: " + fact );
        }
    }   */



/*   public class part3Loops  {
       public static void main(String[] args) {

         int i,  fact=1;
         int number = 8;
           for ( i=1;i<=number;i++) {
               fact = fact * i;
           }
           System.out.println("Factorial of " + number + " is " + fact);
       }
}    */



 /*  public class part3Loops  {
       public static void main(String[] args) {

           // 54.Write a program to print the Fibonacci series up to a given number using a for loop.

           int n=10;
           int a = 0;
           int b = 1;
           System.out.println("THe Fibonacci series up to " + n + " is: " );
           for (int i =0; i<=n;i++)  {
               System.out.println(a + " ");
               int c = a + b;
               a=b;
               b=c;
           }
       }
}    */


/*  public class part3Loops  {
      public static void main(String[] args) {

        // Write a program to print the reverse of a given number using a for loop.


      }
}   */


/*    public class part3Loops  {
        public static void main(String[] args) {

          // 56.Write a program to find the sum of even numbers from 1 to 50 using a for loop.

          int  sum = 0;
          for (int i=2;i<=50;i+=2) {
              sum +=i;
          }
            System.out.println("The sum of 1 to 50 is " + sum);
        }
}    */


 /*  public class part3Loops  {
       public static void main(String[] args) {

          // 57.Write a program to print the ASCII values of all lowercase letters using a for loop.

            char ch;
            int ascii;
            for (ch = 'a';ch <='z';ch++) {
                ascii = (int) ch;
                System.out.println("The Ascii value is " + ch + " is: " + ascii );
            }
       }
}       */


/*   public class part3Loops  {
       public static void main(String[] args) {

          char ch;
          int ascii;
          for (ch = 'A';ch <= 'Z';ch++) {
              ascii = (int) ch;
              System.out.println("The Ascii value is " + ch + " is: " + ascii);
          }
       }
}            */


/*   public class part3Loops {
       public static void main(String[] args) {

        // 58.Write a program to find the prime numbers between 1 and 100 using a for loop.

        //   int i,j;

        boolean isprime;

        for (int i = 2; i <= 100; i++) {
            isprime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                System.out.println(i);
            }
        }
    }

}        */


/*   public class part3Loops  {
       public static void main(String[] args) {

           boolean isprime;
           for (int i=2;i<=1000; i++) {
               isprime = true;
               for ( int j = 2; j * j <= i; j++) {

                   if (i%j==0) {
                       isprime = false;
                       break;
                   }


               }
               if (isprime) {
                   System.out.println(i);
               }
           }
       }
}      */




 /*   public  class part3Loops  {
       public static void main(String[] args) {

         // 59.Write a program to check if a given number is a palindrome using a for loop.



       }
}   */



