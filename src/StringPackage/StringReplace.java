package StringPackage;

import java.util.Scanner;

public class StringReplace {
    public static void main(String[] args) {
       // String success="dotentimesmore";

        //success=success.replace('d','D');

        //System.out.println(success);

       // success=success.replace("ten","eleven");

        //System.out.println(success);

        //success=success.replace('m','M');

        //System.out.println(success);

       // success=success.replace('X','M');

        //it will search the string character to find the old string
        //if its not able to find it will not change the value.

        //String achievments=" do ten times more";

       // achievments=achievments.trim();

        // System.out.println(achievments);

        //print all of them upper case
       //










        //Using scanner give the following value
        //"   Zero to Hero"
        //Trim spaces
        //replace zero with "one"
        //return true if it is equal ignore case to "zero to hero"
        Scanner input=new Scanner (System.in);
        System.out.println("Give me a value:");

        String success=input.nextLine();
        success=success.trim();

        System.out.println(success);

        success=success.replace("Zero","One");

        System.out.println(success);

        System.out.println(success.toUpperCase());

        boolean condition=success.contains("Zero to Hero");

        System.out.println(condition);

      success=success.replace("One to Hero","Zero to Hero");

        System.out.println(success);
        boolean condition1=success.contains("Zero to Hero");

        System.out.println(condition1);
    }

}
