package ScannerPackage;

import java.util.Scanner;

public class vote {

    public static void main(String [] args){


        Scanner input=new Scanner (System.in);


        System.out.println("What is your name?:");

        String name=input.nextLine();

        System.out.println("What is your city:");

        String city=input.nextLine();

        System.out.println("What is your gender:");

        String gender=input.nextLine();

        System.out.println("how old are you?");
        int age=input.nextInt();

        System.out.println("What is your state code:");
       String stateCode=input.next();


        boolean ageComp=age>=18;
        int l=name.length();
        int lcity=city.length();

        System.out.println("is age over 18:"+ageComp);

       boolean firstLet='A' == name.charAt(0);
        System.out.println("is first letter 'A':"+firstLet);

        boolean lastLet='V' == name.charAt(l- 1);
        System.out.println("is last letter 'V':"+lastLet);

        boolean stateCod1='I' == name.charAt(0);
        System.out.println("is first letter 'I':"+stateCod1);

        boolean stateCod2='L' == name.charAt(0);
        System.out.println("is last letter 'L':"+stateCod2);

        boolean citiLeng= lcity<10;
        System.out.println("is city length less than 10:"+citiLeng);

        boolean gender1='M' == gender.charAt(0);
        System.out.println("is gender equal to M:"+gender1);

        boolean vote=ageComp&&firstLet&&lastLet&&citiLeng&&stateCod1&&stateCod2&&gender1;

        System.out.println("Am I able to vote: "+vote);

    }
}
