package test7Part1;

  /*
Write a Java program to check if a string is uppercase, lowercase or mixed case.
Write a Java program to check if a character is alphabetic, numeric or special character.
Write a Java program to check if a year is a leap year in Java using switch statement.
Write a Java program to check if a number is even or odd using switch statement.
Write a Java program to check if a character is vowel or consonant using switch statement.
Write a Java program to check if a number is prime.
Write a Java program to check if a year is leap year or not.
Write a Java program to check if a string contains only digits.
Write a Java program to check if a string contains only alphabets.
Write a Java program to check if a string contains only special characters.
Write a Java program to check if a number is divisible by both 2 and 3.    */

import java.util.Scanner;

/*  public class part1 {
    public static void main(String[] args) {

        // 20.Write a Java program to check if a string is uppercase, lowercase or mixed case.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Alphabet");
        char alphabet = scan.next().charAt(0);
        // String letter = scan.next();
        //  boolean flag = false;
        if (alphabet >= 'A' && alphabet <= 'Z') {
            System.out.println("This is an uppercase case");
        } else if (alphabet >= 'a' && alphabet <= 'z') {
            System.out.println("This is an lowercase case");
        } else {
            System.out.println("This is an mixed case");
        }


    }
}   */

/*  public  class part1 {
      public static void main(String[] args) {

          //21.Write a Java program to check if a character is alphabetic, numeric or special character.

          Scanner scan = new Scanner(System.in);
          System.out.println("Enter the character");
         char character = scan.next().charAt(0);
        //  String character = scan.nextLine();
          if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
              System.out.println("This is an alphabetic characterU");
          } else if (character >= '0' && character <= '9' ) {
              System.out.println("This is a numerical number");
          } else {
              System.out.println("This is a Special character");
          }

      }
}   */

/*  public class part1 {
      public static void main(String[] args) {

          // 22.Write a Java program to check if a year is a leap year in Java using switch statement.

          Scanner scan = new Scanner( System.in);
          System.out.println("Enter the no.of days");
          int year = scan.nextInt();

    //      String word = "hello";
          switch (year) {
              case 366:
                  System.out.println("This is  a leap year");
                  break;
              default:
                  System.out.println("This is not a leap year");
                  break;
          }
        //  System.out.println(word);
      }
}     */

/*  public class part1 {
    public static void main(String[] args) {

        // 23.Write a Java program to check if a number is even or odd using switch statement.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int result = scan.nextInt();
        if (result % 2 == 0) {
            System.out.println("This is an even number");
        } else {
            System.out.println("This is an odd number");
        }
    }
}   */


/*  public class part1 {
    public static void main(String[] args) {

        //23.Write a Java program to check if a number is even or odd using switch statement.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scan.nextInt();
        switch (number % 2 ) {
            case  0:
                System.out.println("This is an even number");
                break;
            case 1:
                System.out.println("This is an odd number");
                break;
            default:
                System.out.println("This is invalid number");
                break;


        }
    }
}     */


/*  public class part1  {
      public static void main(String[] args) {

          //24.Write a Java program to check if a character is vowel or consonant using switch statement.

       Scanner scan = new Scanner(System.in);
          System.out.println("Enter the character");
          char alphabet = scan.next().charAt(0);
          switch (alphabet) {
              case 'a':
                  System.out.println("This is an vowel");
                  break;
              case 'e':
                  System.out.println("This is an vowel");
                  break;
              case 'i':
                  System.out.println("This is an vowel");
                  break;
              case 'o':
                  System.out.println("This is an vowel");
                  break;
              case 'u':
                  System.out.println("This is an vowel");
                  break;
              default:
                  System.out.println("This is a consonant");
                  break;
          }
      }
}   */


/*  public class part1  {               //didn't get the answer
    public static void main(String[] args) {

       // 25.Write a Java program to check if a number is prime.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scan.nextInt();
        switch ((num%2) || (num%3)) {
            case 0:
                System.out.println("This is not prime number");
                break;
            case 1:
                System.out.println("This is  a prime number");
                break;
            default:
                System.out.println("This is invalid number");
                break;
        }


    }
}        */


/*  public class part1  {
    public static void main(String[] args) {

        // 26.Write a Java program to check if a year is leap year or not.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no.of days");
        int num=scan.nextInt();
        if (num == 366) {
            System.out.println("This is a leap year");
        } else {
            System.out.println("This is not a leap year");
        }
    }
}    */


 /*  public class part1 {
    public static void main(String[] args) {

        // 27.Write a Java program to check if a string contains only digits.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = scan.nextLine();

        boolean atDigit = true;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (!Character.isDigit(ch)) {
                atDigit = false;
                break;

            }
        }
        if (atDigit) {
            System.out.println("This string  contains digits only");
        }  else {
            System.out.println("This string contains not only digits");
        }

    }
}       */




/*    public  class part1  {
    public static void main(String[] args) {

        //  28.Write a Java program to check if a string contains only alphabets.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scan.nextLine();

        boolean isAlphabets = true;
        for (int i=0; i<str.length();i++) {
            char ch = str.charAt(i);
            if (!Character.isAlphabetic(ch)) {
                isAlphabets = false;
                break;
            }
        }
        if (isAlphabets) {
            System.out.println("The string contains only alphabets");
        } else {
            System.out.println("The string contains not only alphabets");
        }
    }

}   */


/*  public class part1  {
      public static void main(String[] args) {

       // 29.Write a Java program to check if a string contains only special characters.

          Scanner scan =new Scanner(System.in);
          System.out.println("Enter the string: ");
          String str = scan.nextLine();

          boolean isSpecialCharacter = true;
          for (int i=0;i<str.length();i++) {
              char ch = str.charAt(i);
              if (Character.isAlphabetic(ch) || Character.isDigit(ch)) {
                  isSpecialCharacter = false;
                  break;
              }
          }
          if (isSpecialCharacter) {
              System.out.println("The string contains only special characters");
          } else {
              System.out.println("The string contains non special characters");
          }
      }
}             */


/*  public class part1  {
      public static void main(String[] args) {

          // 30.Write a Java program to check if a number is divisible by both 2 and 3.

          Scanner scan = new Scanner(System.in);
          System.out.println("Enter the number: ");
          int num = scan.nextInt();
          if ((num%2==0) || (num%3==0)) {
              System.out.println("This number is divisible by both 2 and 3");
          }  else {
              System.out.println("This number is not divisible by both 2 and 3 ");
          }

      }
}                  */


/*   public class part1 {
    public static void main(String[] args) {

        // 31.Write a Java program to check if a number is divisible by both 5 and 6.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scan.nextInt();
        if((num%5==0) || (num%6==0)) {
            System.out.println("THis number is divisible by both 5 and 6");
        } else {
            System.out.println("This number is not divisible by both 5 and 6");
        }
    }
}    */


/*  public class part1  {
      public static void main(String[] args) {

          //32.Write a Java program to check if a number is divisible by 11.

          Scanner scan = new Scanner(System.in);
          System.out.println("Enter the number: ");
          int num = scan.nextInt();
          if (num%11==0) {
              System.out.println("This number is divisible by 11");
          } else {
              System.out.println("This number is not divisible by 11");
          }
      }
}      */


/*   public class part1  {
      public static void main(String[] args) {

          //33.Write a Java program to check if a string contains both digits and alphabets or not.

          Scanner scan = new Scanner(System.in);
          System.out.println("Enter the String: ");
          String str = scan.nextLine();

          boolean digitsandalphabets = true;
          for (int i=0;i<str.length();i++) {
              char ch = str.charAt(i);
              if ((!Character.isAlphabetic(ch)) && (!Character.isDigit(ch))) {
                  digitsandalphabets = false;
                  break;

              }
          }
          if (digitsandalphabets) {
              System.out.println("This string contains both digits and alphabets");
          } else {
              System.out.println("This string does not contains both digits and alphabets");
          }
      }
}            */











