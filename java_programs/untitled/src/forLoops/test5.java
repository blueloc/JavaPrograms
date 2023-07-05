package forLoops;

  // 1.Write a for/while loop that prints numbers from 1 to 10.

 /*  public class test5 {
    public static void main(String[] args) {

        for(int i=1;i<=10;i++) {
            System.out.println("numbers is " + i);
           }
    }
  }  */


/*  public class test5 {
      public static void main(String[] args) {

          int i=1;
          while (i<=10) {
              System.out.println("numbers is a " + i);
              i++;
          }
      }
  }  */


   // 2.Write a for/while loop that prints numbers from 10 to 1 in descending order.


  //forloop

/*   public class test5 {
    public static void main(String[] args) {

       for (int i=10;i>=1;i--) {
          System.out.println("numbers is " + i);
       }

    }
}     */


   //whileloop

  /*   public class test5 {
        public static void main(String[] args) {

           int i=10;
           while (i>=1) {
              System.out.println("number in " + i);
              i--;
           }
        }
}         */


  // 3.Write a for/while loop that prints the multiplication table for a given number = 10.

  // a.forloop



 /*  public class test5 {
   public static void main(String[] args) {

      int number = 10;
      for(int i=1;i<=10;i++) {
         int result = number * i;
         System.out.println(number + "*" + i + "=" + result);
      }
   }
}  */

  // b.whileloop  Write a for/while loop that prints the multiplication table for a given number = 10.

   // In whileloop we do initialization outside;
  // in whileloop we do the initialization outside;

  // in whileloop we do the initialization outside;

  /*   public class test5 {
        public static void main(String[] args) {

           int  number=10;
           int i=1;
           while ( i<=10) {
              int result = number *i;
              System.out.println(number + "*" + i + "=" + result);
              i++;
           }
        }

     }   */


  //   4.Write a for/while loop that calculates the sum of even numbers from 1 to 100.

  // forloop

 /*  public class test5 {
       public static void main(String[] args) {
         int number = 2;
           for(int i=2;i<=100;i+=2) {

                   System.out.println("even numbers " + result);
               }
           }
       }
}  */


 /*  public class test5 {
      public static void main(String[] args) {


       //  1. Write a switch case statement that takes a day of the week as input (1-7) and prints the corresponding day name.


          String week = "4";
          switch (week) {
              case "1":
                  System.out.println("sunday");
                  break;
              case "2":
                  System.out.println("monday");
                  break;
              case "3":
                  System.out.println("tuesday");
                  break;
              case "4":
                  System.out.println("wednesday");
                  break;
              case "5":
                  System.out.println("thursday");
                  break;
              case "6":
                  System.out.println("friday");
                  break;
              case "7":
                  System.out.println("saturday");
                  break;
              default:
                  System.out.println("you are entering invalid number");
                  break;
          }



          }
}                  */




/*  public class test5  {
    public static void main(String[] args) {

        // 2.Write a switch case statement that takes a month number (1-12) as input and prints the corresponding month name.

        String month = "10";
        switch (month) {

            case "1":
                System.out.println("january");
                break;
            case "2":
                System.out.println("feb");
                break;
            case "3":
                System.out.println("march");
                break;
            case "4":
                System.out.println("april");
                break;
            case "5":
                System.out.println("may");
                break;
            case "6":
                System.out.println("june");
                break;
            case "7":
                System.out.println("july");
                break;
            case "8":
                System.out.println("august");
                break;
            case "9":
                System.out.println("september");
                break;
            case "10":
                System.out.println("octomber");
                break;
            case "11":
                System.out.println("november");
                break;
            case "12":
                System.out.println("december");
                break;

            default:
                System.out.println("invalid number");
                break;
        }

    }
}          */



 // 3. Write a switch case statement that takes a grade (A, B, C, D, F) as input and prints a corresponding message based on the grade.

/*  public class test5 {
      public static void main(String[] args) {

          String grade = "C";
          switch (grade) {
              case "A":
                  System.out.println("outstanding");
                  break;
              case "B":
                  System.out.println(" good");
                  break;
              case "C":
                  System.out.println("average");
                  break;
              case "D":
                  System.out.println("below average");
                  break;
              case "E":
                  System.out.println("fail");
                  break;

              default:
                  System.out.println("invalid entry");
                  break;
          }
      }
}             */


  // 4.Write a switch case statement that takes a character as input and checks if it is a vowel or consonant.

/*  public class test5 {
    public static void main(String[] args) {

        String character = "u";
        switch (character) {

            case "A":
                System.out.println("vowels");
                break;
            case "E":
                System.out.println("vowels");
                break;
            case "I":
                System.out.println("vowels");
                break;
            case "O":
                System.out.println("vowels");
                break;
            case "U":
                System.out.println("vowels");
                break;
            default:
                System.out.println("consonant");
                break;
        }

    }
}          */


  // 5.Write a switch case statement that takes a country code (e.g., "US", "UK", "IN") as input and prints the corresponding country name.


/*   public class test5  {
       public static void main(String[] args) {
           String code = "IN";
           switch (code) {
               case "IN":
                   System.out.println("INDIA");
                   break;
               case "US":
                   System.out.println("usa");
                   break;
               case "UK":
                   System.out.println("united kindom");
                   break;
               default:
                   System.out.println("invalid country code");
                   break;

           }
       }
}            */


// 6.Write a switch case statement that takes a number as input and checks if it is positive, negative, or zero.

/*  public class test5 {
      public static void main(String[] args) {

          String number = "1";
          switch (number) {
              case "-1":
                  System.out.println("negative number");
                  break;
              case "0":
                  System.out.println("zero");
                  break;
              case "1":
                  System.out.println("positive number");
                  break;
              default:
                  System.out.println("invalid number");
                  break;



          }
      }
}                 */


  // 7.Write a switch case statement that takes a color code (e.g., "R", "G", "B") as input and prints the corresponding color name.


/*  public class test5 {
      public static void main(String[] args) {
          String code= "B";
          switch (code) {
              case "R":
                  System.out.println("Red color");
                  break;
              case "G":
                  System.out.println("Green color");
                  break;
              case "B":
                  System.out.println("Blue color");
                  break;
              default:
                  System.out.println("invalid color code");
                  break;
          }
      }
}                     */

//8.Write a switch case statement that takes a command ("start", "stop", "pause") as input and performs the corresponding action.

/*  public class test5 {
      public static void main(String[] args) {
          String command = "stop";
          switch (command) {
              case "start":
                  System.out.println("The action is initiated due to start command");
                  break;
              case "stop":
                  System.out.println("The action is stoped due to stop command");
                  break;
              case "pause":
                  System.out.println("The action is paused due to pause command");
                  break;
              default:
                  System.out.println("invalid command");
                  break;
          }
      }
}      */


 //9.Write a switch case statement that takes a day number (1-365) as input and prints the corresponding season (spring, summer, autumn, winter).

/*  public class test5 {
     public static void main(String[] args) {

         String season = "5";
         switch (season) {
             case "1":
             case "2":
             case "3":
             case "4":
             case "5":
                 System.out.println("the season is spring");
                 break;
             case "6":
             case "7":
             case "8":
             case "9":
             case "10":
                 System.out.println("the season is summer");
                 break;
             case "11":
             case "12":
             case "13":
             case "14":
             case "15":
                 System.out.println("the season is autumn");
                 break;
             case "16":
             case "17":
             case "18":
             case "19":
             case "20":
                 System.out.println("the season is winter");
                 break;

             default:
                 System.out.println("invalid input");
                 break;

         }

     }
}    */


           // pattern programs


   public class test5 {
    public static void main(String[] args) {
       int rows = 5;
        for(int i=1; i<=rows; i++) {
         for  (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


 /*  public class test5 {
       public static void main(String[] args) {
            int rows = 5;
            for(int i=rows;i>=1;i--) {
                for(int j=1;j<=i;j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
       }
}        */

/*  public class test5  {
      public static void main(String[] args) {
          int rows = 5;
          for (int i=1;i<=rows;i++) {
              for (int j=1;j<=i;j++) {
                  System.out.print( j + " ");

              }
              System.out.println();
          }
      }
}   */

/*  public class test5  {
     public static void main(String[] args) {
         int rows=10;
         for (int i=rows;i>=1;i--) {
             for (int j=1;j<=i;j++) {
                 System.out.print(i + "");

             }
             System.out.println();
         }
     }
}         */

/*  public  class test5  {
      public static void main(String[] args) {
          int rows=10;
          for(int i=rows;i>=1;i--) {
              for (int j=1;j<=i;j++) {
                  System.out.print( j + " ");

              }
              System.out.println();
          }
      }
}         */


 /*   public class test5  {
        public static void main(String[] args) {

            int rows = 5;
            for(int i=1;i<=rows;i++) {
                for (int j=1;j<=rows -i;j++) {
                    System.out.print( " " );
                }
                for (int k=1;k<=2*i -1;k++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
}             */


 /*  public class test5  {
       public static void main(String[] args) {
           int rows = 10;
           for(int i=1;i<=rows;i++) {
               for (int j=1;j<=rows -i;j++) {
                   System.out.print( " ");
               }
               for (int k=1;k <= 2*i -1;k++) {
                   System.out.println("*");
               }
               System.out.println(" ");
           }
       }
}    */

 /* public class test5  {
      public static void main(String[] args) {

          int rows = 5;
          for (int i=rows;i>=1;i--) {
              for (int j=rows;j>=i;j++) {
                  System.out.print(" " );
              }
              for (int k=1;k <=2*i -1;k++);
          }
          System.out.println(" ");
      }
}   */



