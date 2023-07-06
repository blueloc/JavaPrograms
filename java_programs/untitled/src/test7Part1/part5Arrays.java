package test7Part1;

import java.util.Scanner;

/* public class part5Arrays {
    public static void main(String[] args) {

        // 88.Find the sum of all elements in an array.

        int []array = {14,2,78,52,45};
     //   Scanner scan = new Scanner(System.in);
     //   System.out.println("THe sum of all elements : ");
     //   int number = scan.nextInt();

        int sum =0;
        for (int i=0;i<array.length;i++) {
            sum = sum+ array[i];
        }
        System.out.println("sum of all elements in an array " + sum);
    }
}    */


/*  public class part5Arrays  {
      public static void main(String[] args) {

          int []arr = { 3,4,5};

          int sum =0;
          for (int i=0;i<arr.length;i++) {
              sum = sum + arr[i];
          }
          System.out.println("sum of elements " + sum);
      }
}    */


/*   public  class part5Arrays  {
       public static void main(String[] args) {

           // product of all elements
           int [] arr= {4,5,6};

           int product= 1;
           for (int i=0;i<arr.length;i++) {
               product = product * arr[i];
           }
           System.out.println("product of all elements " + product);
       }
}       */



/*  public  class part5Arrays  {
      public static void main(String[] args) {

         // 89.Find the largest element in an array.

          int [] arr = {14,85,67,62,10};

           int max= arr[0];
           for(int i=0;i<arr.length;i++) {
               if (arr[i]>max) {
                   max=arr[i];
               }
           }
          System.out.println(" The maximum of given element " + max);

      }
}    */


/*  public class part5Arrays {
      public static void main(String[] args) {

         //  90.Find the smallest element in an array.

          int [] arr = {36,54,23,78,11};
          int min = arr[0];
          for (int i=0;i<arr.length;i++) {
              if ( arr[i]<min) {
                  min = arr[i];
              }
          }
          System.out.println("The smallest element in the array " + min);
      }
}   */



/*   public class part5Arrays  {
       public static void main(String[] args) {

           // 91.Find the average of elements in an array.

           int[] arr = {2,4,6};
           int sum = 0; int avg;

           for (int i=0;i<arr.length;i++) {
               sum = sum +arr[i];
            //   avg = sum/2;
           }
           avg = sum/2;
           System.out.println("The average of elements " + avg);



       }
}       */


/*  public class part5Arrays {
    public static void main(String[] args) {

        // 92.Count the number of even elements in an array.

        int[] arr = {2, 3, 4, 6, 7, 8, 9};

        int evencount=0;

        for (int i=0;i<arr.length;i++) {
            if (i%2 == 0) {
                evencount++;
              //  count++;
            }
         //   count++;
        }
     //   count++;
        System.out.println("count of even elements  " + evencount);


    }
}       */



/*  public  class part5Arrays  {
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          System.out.println("Enter the number of elements in the array");
          int n= scan.nextInt();

          int []arr= new int[n];
          System.out.println("Enter the elements in the array");

          for (int i=0;i<n;i++) {
              arr[i] = scan.nextInt();
          }
          int evencount=0;
          for(int i=0;i<arr.length;i++) {
              if (arr[i]%2==0) {
                evencount++;
              }
          }
          System.out.println("count of even numbers: " + evencount);
      }
}     */




/*   public class part5Arrays  {
       public static void main(String[] args) {


          // 93.Count the number of odd elements in an array.

           Scanner scan = new Scanner(System.in);
           System.out.println("Enter the number of elements in the array:");
           int n= scan.nextInt();

           int[] arr= new int[n];
           System.out.println("Enter the elements in the array:");

           for (int i=0;i<n;i++) {
               arr[i]=scan.nextInt();
           }

           int oddcount=0;
           for (int i=0;i<arr.length;i++) {
               if (arr[i]%2!=0) {
                   oddcount++;
               }
           }
           System.out.println("The count of oddnumbers in the array is " + oddcount);

       }
}      */



/*  public class part5Arrays  {
      public static void main(String[] args) {

         // 94.Find the sum of even elements in an array.

          Scanner scan = new Scanner(System.in);
          System.out.println("Enter the number of elements in the array");
          int n= scan.nextInt();

          int arr[]=new int[n];
          System.out.println("Enter the elements of an array");

          for (int i=0;i<n;i++) {
              arr[i] = scan.nextInt();
          }
            int sum=0;
            for (int i=0;i<arr.length;i++) {
                if (arr[i]%2==0) {
                    sum=sum +arr[i];
                }
            }
          System.out.println("sum of even elements in the array " + sum);


      }
}         */



 /*  public class part5Arrays  {
       public static void main(String[] args) {

           // 95.Find the sum of odd elements in an array.

           Scanner scan = new Scanner(System.in);
           System.out.println("Enter the number of elements in an array");
           int n= scan.nextInt();

           int []arr=new int[n];
           System.out.println("Enter the elements in the array");

           for (int i=0;i<n;i++) {
               arr[i]=scan.nextInt();
           }

           int sum=0;
           for (int i=0;i<arr.length;i++) {
               if (arr[i]%2 !=0) {
                   sum = sum + arr[i];
               }
           }
           System.out.println("sum of odd numbers in the array "  + sum);

       }
}     */



/*  public  class part5Arrays  {
      public static void main(String[] args) {

          // 96.Calculate the product of elements in an array.

          Scanner scan = new Scanner(System.in);
          System.out.println("Enter the number of elements in the array");
          int n= scan.nextInt();

          int[] arr= new int[n];
          System.out.println("Enter the elements of the array");

          for (int i=0;i<n;i++) {
               arr[i]=scan.nextInt();
          }

          int product=1;
          for (int i=0;i<arr.length;i++) {
              product = product * arr[i];
          }
          System.out.println("THe product of the elements is " + product);
      }
}    */


/*  public class part5Arrays  {                        // for some reason we can't check debugging
      public static void main(String[] args) {          // u forget to put debug points idiot!


         // 97.Find the second largest element in an array.

          Scanner scan = new Scanner(System.in);
          System.out.println("Enter the number of elements of the array");
          int n= scan.nextInt();

          int[] arr= new int[n];
          System.out.println("Enter the elements of the array");

          for (int i=0;i<n;i++) {
              arr[i]=scan.nextInt();
          }

          int largest = arr[0];
          int secondLargest = arr[0];
          for (int i=0;i<arr.length;i++) {
              if (arr[i]>largest) {
                  secondLargest = largest;
                  largest=arr[i];
               //   secondLargest = largest;

              } else if ( arr[i]> secondLargest) {
                  secondLargest = arr[i];
              }
          }
          System.out.println("The second largest element of the array is " + secondLargest);

      }
}      */




/*   public  class part5Arrays  {
       public static void main(String[] args) {

          // 98.Find the second smallest element in an array.

           Scanner scan = new Scanner(System.in);
           System.out.println("Enter the number of elements in an array");
           int n=scan.nextInt();

           int[] arr=new int[n];
           System.out.println("Enter the elements in the array");

           for (int i=0;i<n;i++) {
               arr[i]=scan.nextInt();
           }

           int smallest=arr[0];
           int secondSmallest=arr[0];
           for (int i=0;i<arr.length;i++) {
              if  (arr[i]<smallest) {
                  secondSmallest = smallest;
                  smallest = arr[i];
              } else if ( arr[i]< secondSmallest) {
                  secondSmallest = arr[i];
              }

           }
           System.out.println("The second smallest element in the array " + secondSmallest);
       }
}      */




/*  public  class part5Arrays  {
      public static void main(String[] args) {

         // 99.Check if an array is sorted in ascending order.

        Scanner scan = new Scanner(System.in);
          System.out.println("Enter the number of elements of the array");
          int n= scan.nextInt();

          int [] arr = new int[n];
          System.out.println("Enter the elements of the array");

          for (int i=0;i<n;i++) {
              arr[i]= scan.nextInt();
          }

          boolean isSorted=true;
          for (int i=1;i<arr.length;i++) {
              if (arr[i] < arr[i-1]) {
                  isSorted= false;
                  break;

              }
          }
          if (isSorted) {
              System.out.println("The array is sorted in ascending order");
          } else  {
              System.out.println("THe array is not sorted in ascending order");
          }


      }
}     */



/*  public class part5Arrays  {
      public static void main(String[] args) {

         //100.Check if an array is sorted in descending order.

          Scanner scan = new Scanner(System.in);
          System.out.println("Enter the number of elements of an array");
          int n = scan.nextInt();

          int[] arr= new int[n];
          System.out.println("Enter the elements of an array");

          for (int i=0;i<n;i++) {
              arr[i] = scan.nextInt();
          }

          boolean isSorted = true;
          for (int i=1;i<arr.length;i++) {
              if (arr[i] > arr[i-1]) {
                  isSorted = false;
                  break;
              }
          }
          if (isSorted) {
              System.out.println("The array is sorted in descending order");
          } else {
              System.out.println("The array is not sorted in descending order");
          }

      }
}       */



/*      public class part5Arrays  {
          public static void main(String[] args) {

             // 101.Reverse an array.


              Scanner scan = new Scanner(System.in);
              System.out.println("Enter the number of elements of an array");
              int n= scan.nextInt();

              int []arr = new int[n];
              System.out.println("Enter the elements of an array");

              for (int i=0;i<n;i++) {
                  arr[i]=scan.nextInt();
              }

              int start = 0;
              int end = n-1;

              while (start <end ) {
                  int temp = arr[start];
                  arr[start]=arr[end];
                  arr[end]= temp;

                  start++;
                  end--;
              }

              System.out.println("THe reverse of an array is ");
              for (int i=0;i<n;i++) {
                  System.out.println(arr[i]);
              }
          }
}                  */




/*  public class part5Arrays  {
      public static void main(String[] args) {


         // 102.Find the frequency of each element in an array.

          Scanner scan = new Scanner(System.in);
          System.out.println("Enter the number of elements of an array: ");
          int n= scan.nextInt();

          int[] arr=new int[n];
          System.out.println("Enter the elements of an array");

          for (int i=0;i<n;i++) {
              arr[i]=scan.nextInt();
          }

          int [] frequency = new int[100];

          for(int i=0;i<n;i++) {
              frequency[arr[i]]++;
          }

          System.out.println("The frequency of each element is");
          for(int i=0;i<100;i++) {
            if (frequency[i] != 0) {
                System.out.println(i +" " + frequency[i]);

            }
          }
      }
}             */










