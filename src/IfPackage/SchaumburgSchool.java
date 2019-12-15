package IfPackage;

import java.util.Scanner;

public class SchaumburgSchool {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Please Provide Your Age:");

        int age=input.nextInt();


        System.out.println("What is your Score:");

        double score=input.nextDouble();

        System.out.println("What is your city:");

        boolean city = input.nextBoolean();

        System.out.println("Are you a US Citizen:");

        boolean citizen = input.nextBoolean();


        if (age>=14 && city==true && score>=75 && citizen==true){

             System.out.println( "Student can Attend classes in Schaumburg High School");
         }else{

             System.out.println("Student cannot attend classes in Schaumburg District");
         }







    }

}
