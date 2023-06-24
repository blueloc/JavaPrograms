package calculation_programs;

public class ConcatinationPrograms  {
    public static void main(String[] args) {

      /*  7.	Write a Java program to concatenate two strings and display the result.
          First_name = manoj
        Second_name = kumar;
      */                 // ctl+sht+/


        String firstName = "manoj";
        String secondName = "kumar";
        String fullName = firstName + " " + secondName;

       // firstName.concat(secondName);
       // System.out.println(fullName);
        System.out.println(firstName.concat(" " + secondName));



    }
}
