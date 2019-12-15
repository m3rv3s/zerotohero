package Practice;

import java.util.Arrays;

public class AddEmail {

    public static void main(String[] args) {

        String names[]={"Lisa", "Kubat","yalcin","Sema" ,"Sema" ,"kira"};

        //write a program that will convert this names to email and will save the array
        //for example:[lisa@gmail.com]

        String[] emails=new String[names.length];

        for (int i=0;i<names.length;i++){
            emails[i]=names[i]+"@gmail.com";

          //  System.out.println(emails[i]);
        }
        System.out.println(Arrays.toString(emails));







    }





}
