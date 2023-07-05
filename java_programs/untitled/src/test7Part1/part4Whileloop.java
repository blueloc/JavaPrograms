package test7Part1;

/*  public class part4Whileloop {
    public static void main(String[] args) {


      // 61.Write a program to print numbers from 1 to 10 using a while loop.

      int i=1;
      while (i<=10) {
          System.out.println("The numbers is " + i);
          i++;
      }
    }
}   */


 /*  public class part4Whileloop  {
       public static void main(String[] args) {

         // 62.Write a program to calculate the sum of numbers from 1 to 100 using a while loop.

           int sum=0;
           int i=1;
           while (i<=100) {

               sum+=i;
               i++;
             //  System.out.println("The sum of numbers from 1 to 100 is " + sum);
           //    sum+=i;
            //   i++;
           }
           System.out.println("The sum of numbers from 1 to 100 is " + sum);
       }
}   */


/*  public class part4Whileloop  {
      public static void main(String[] args) {

          int sum =0;
          int i=5;
          while (i<=20) {
              sum+=i;
              i++;
          }
          System.out.println("The sum from 5 to 20 numbers is " + sum);
      }
}         */


 /*  public class part4Whileloop {
       public static void main(String[] args) {

           // 63.Write a program to print the multiplication table of a given number using a while loop.

           int i=1;
           int number = 6;
           while (i<=10) {
              int result =number *i;


               System.out.println(number + "*" + i + "=" + result);
               i++;
           }
         //  System.out.println(number + "*" + i + "=" + result);
       }
}     */


import java.util.Scanner;

/*  public class part4Whileloop  {
      public static void main(String[] args) {


        // 64.Write a program to find the factorial of a given number using a while loop.


         Scanner scan = new Scanner(System.in);
          System.out.println("Enter the number");
          int num = scan.nextInt();

          int factorial = 1;
          int i=1;

          while (i<=num) {
              factorial *=i;
              i++;
          }
          System.out.println("The factorial is " + num +" is: " + factorial);
      }
 }   */


/*   public class part4Whileloop  {
       public static void main(String[] args) {

           Scanner scan = new Scanner(System.in);
           System.out.println("Enter the number");
           int number = scan.nextInt();

           int factorial =1;
           int i=1;
           while (i<=number) {
               factorial *=i;
               i++;
           }
           System.out.println("The factorial is " + number + " is: " + factorial);
       }
}          */


 /*  public class part4Whileloop  {
     public static void main(String[] args) {

       //  65.Write a program to print the Fibonacci series up to a given number using a while loop.

         Scanner scan= new Scanner(System.in);
         System.out.println("Enter the number");
         int number = scan.nextInt();

         int firstTerm =0;
         int secondTerm =1;
         int nextTerm;

         System.out.println("The Fibonacci number is " + number + "is: " );
         System.out.println(firstTerm + " " + secondTerm);

         while ( nextTerm <=number) {
             nextTerm = firstTerm+ secondTerm;
             System.out.println(" " + nextTerm);
             firstTerm = secondTerm;
             secondTerm=nextTerm;
         }


     }
}   */




 /*  public class part4Whileloop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;
        int nextTerm ;

        System.out.println("The Fibonacci series up to " + number + " is: ");
        System.out.print(firstTerm + " " + secondTerm);

        while (nextTerm <= number) {
            nextTerm = firstTerm + secondTerm;
            System.out.print(" " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}            */


/*    public class part4Whileloop  {
      public static void main(String[] args) {


          //  65.Write a program to print the Fibonacci series up to a given number using a while loop.

          int n=10;
          int a=0;
          int b=1; int i=0;

          System.out.println("The fibonacci number " + n + " is ");
          while (i<=n) {
              System.out.println(a + "");
              int c= a+b;
              a =b;
              b =c;
              i++;
          }
      }
  }    */




 /*  public  class part4Whileloop  {
       public static void main(String[] args) {

         // 66.Write a program to print the reverse of a given number using a while loop.


       }
}     */


/*  public class part4Whileloop  {
      public static void main(String[] args) {

        // 67.Write a program to find the sum of even numbers from 1 to 50 using a while loop.

          int sum=0;
          int i=2;
          while (i<=50) {
              sum+=i;
        //      System.out.println("THe sum of even numbers from 1 to 50 is " + sum);
       //     sum+=i;
             i+=2;

          }
          System.out.println("THe sum of even numbers from 1 to 50 is " + sum);
      }
}   */


/*  public class part4Whileloop  {
     public static void main(String[] args) {

         // 68.Write a program to print the ASCII values of all lowercase letters using a while loop.

         char ch;
         int ascii;
         ch = 'a';
         while (ch <='z') {
             ascii= (int) ch;
             System.out.println("the ascii values of all lowercase is " + ch + " is :" + ascii);
             ch++;
         //    ascii = (int) ch;
         }
     }
}        */




/*  public class part4Whileloop {
      public static void main(String[] args) {

         //  Write a program to print the ASCII values of all lowercase letters using a while loop.

          char ch='A';
          int ascii;
          while (ch <='Z') {
              ascii= (int) ch;
              System.out.println("THe Ascill values of all Uppercase " + ch + " is :" + ascii);
              ch++;
          }
      }
}   */


   public class part4Whileloop  {
       public static void main(String[] args) {

          // 69.Write a program to find the prime numbers between 1 and 100 using a while loop.

          int i=2;
          while (i<=100) {
              
          }
       }
}