package arraysDemo;

 /* public class arrayDemo {
    public static void main(String[] args) {
        int[] array1 = {1,10,3,7,5};
    //    System.out.println(array1[1]);
        for (int i=0;i<array1.length;i++) {
            System.out.println(array1[i]);
        }

    }
}  */


/*  public class arrayDemo {
    public static void main(String[] args) {


        int[] array2 = {1, 2, 3, 4, 6, 5, 7, 8, 9, 10};
        int count = 0;

        for (int i = 0; i < array2.length; i++) {
            if (array2[i] % 2 != 0) {
                count++;
                System.out.println(array2[i]);
            }
        }
        System.out.println(count);


    }
}  */


import java.util.Scanner;

public class arrayDemo {
    public static void main(String[] args) {

        int[] account = {11, 54, 34, 84, 57, 26, 98, 75, 62, 96, 43};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int number = scanner.nextInt();
        boolean flag = false;
        for (int i = 0; i < account.length; i++) {
            if (account[i] == number) {
                flag = true;
                break;
            }
        }


        if (flag) {
            System.out.println("Arrays contains the element");

        } else {
            System.out.println("Arrays doesn't contains the element ");
        }
    }
}

