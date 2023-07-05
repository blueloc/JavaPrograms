package ifConditionTest;

import java.util.Scanner;

public class numberToWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scan.nextInt();

        String word = "";
        switch (number) {
            case 1:
                System.out.println("The number in words is one");
                break;
            case 2:
                System.out.println("The number in words is Two");
                break;
            case 3:
                System.out.println("The number in words is Three");
                break;
            case 4:
                System.out.println("The number in words is Four");
                break;
            case 5:
                System.out.println("The number in words is Five");
                break;
            case 6:
                System.out.println("The number in words is six");
                break;
            case 7:
                System.out.println("The number in words is Seven");
                break;
            case 8:
                System.out.println("The number in words is Eight");
                break;
            case 9:
                System.out.println("The number in words is Nine");
                break;
            default:
                System.out.println("Invalid number");
                break;
        }
        System.out.println( word);
    }
}
