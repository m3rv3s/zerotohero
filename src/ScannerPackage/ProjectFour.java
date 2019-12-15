package ScannerPackage;

import java.util.Scanner;

public class ProjectFour {

    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);

        System.out.println("please enter 3 words:");

        String firstStr=input.nextLine();
        String secondStr=input.nextLine();
        String thirdStr=input.nextLine();
        System.out.println(firstStr.charAt(0));
        System.out.println(secondStr.charAt(0));
        System.out.println(thirdStr.charAt(0));


        System.out.println(firstStr.indexOf("e"));
        System.out.println(secondStr.indexOf("e"));
        System.out.println(thirdStr.indexOf("e"));

        int length1=firstStr.length();
        int length2=secondStr.length();
        int length3=thirdStr.length();


        System.out.println(firstStr.charAt(length1-1));
        System.out.println(secondStr.charAt(length2-1));
        System.out.println(thirdStr.charAt(length3-1));

        System.out.println(firstStr.toUpperCase());
        System.out.println(secondStr.toUpperCase());
        System.out.println(thirdStr.toUpperCase());

        boolean lastChar1=firstStr.charAt(length1-1)==secondStr.charAt(length2-1);
        boolean lastChar2=secondStr.charAt(length1-1)==thirdStr.charAt(length2-1);
        boolean lastChar=lastChar1==lastChar2;


        boolean  ll1=length1==length2;
        boolean  ll2=length2==length3;
        boolean  ll=ll1==ll2;

    boolean  allEqualor=ll||lastChar;

        System.out.println("Return True:"+allEqualor);



    }
    }


