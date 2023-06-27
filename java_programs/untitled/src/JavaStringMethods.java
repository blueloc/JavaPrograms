public class JavaStringMethods {
    public static void main(String[] args) {

       // string = a reference datatype that can store one or more characters
        //         reference datatypes  have access to usefull methods
        // is case-sensitive

        String name = "Nandhan";
       // boolean result = name.equals("Nandhan");
      //  boolean result = name.equalsIgnoreCase("nandhan");
      //  int result = name.length();
      //  char result = name.charAt(5);
      //  int result = name.indexOf("a");
       //  boolean result = name.isEmpty();
       // String result = name.toUpperCase();
      //  String result = name.toLowerCase();
        //  String result = name.trim();
        String result = name.replace("n","b");


        System.out.println(result);
    }
}
