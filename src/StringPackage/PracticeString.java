package StringPackage;

import java.util.Scanner;

public class PracticeString {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);

        System.out.println("Please Provide two Strings:");

        String name=input.nextLine();
        String name1=input.nextLine();

        boolean condition=name.equals(name1);
        System.out.println(condition);

         int length=name.length();
         int length1=name1.length();
        int x=name.length();
        int y=name1.length();

         boolean condition1=x==y;

        System.out.println(condition1);

        System.out.println(name.charAt(length-1));
        System.out.println(name1.charAt(length1-1));

       // real="2019" +real;
        // marketing="2019" + marketing
        //system.out.println(real);
        //system.out.println(marketing);



        boolean condition2=name.equals(name1);

        System.out.println(condition2);

        String valueWithYear=" Real Estates 2019 ";
        System.out.println(valueWithYear);




        System.out.println(valueWithYear.replace(" ","-"));




        System.out.println(valueWithYear.substring(4,8).toUpperCase().trim());


        //String to compare the value we can not use the logical operators






    }


}
