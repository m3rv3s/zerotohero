package Practice;

import java.util.Scanner;

public class TechtorialAcademy {
//
//    String name="techtorial Academy";
//
//    Go over all the string and print if your letter is equals to 'a' or 'A';

    public static void main(String[] args) {


    Scanner input=new Scanner(System.in);


             String name="Techtorial Academy";


        System.out.println(name.charAt(17));
        //it will give the stringIndexOfBoundException
        //runtime error

        System.out.println(name.indexOf('k'));
             //-1
        System.out.println(name.replace('k','a'));
        //since there is no K inside my string it will remain same.

        System.out.println(name.length());

        for (int i=0;i<name.length()-1;i++){
          //  System.out.print(name.charAt(i)+",");

        if (name.charAt(i)=='a' || name.charAt(i)=='A'){
            System.out.println(name.charAt(i));
        }

        }





                }

              }



