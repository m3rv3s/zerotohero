package IfPackage;

import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {
        //Scanner input=new Scanner (System.in);

        //int averageScore=70;
        ////80-89=B

        // if ( averageScore>=80 && averageScore < 90 ){

        //  System.out.println("Letter grade is B ");

        // System.out.println("student pass the class");

        // }
        // System.out.println(averageScore);


        //inputs are using scanner
        //driver license example
        //age more than 16 or equal
        //state ID
        //drving practice should pass
        //this condition is true you cN GET THE driver license
        //this condition is false you cnnot get the license

        Scanner input = new Scanner(System.in);
        System.out.println("Driver License :");

        System.out.println("How old are you:");

        int age = input.nextInt();

        System.out.println("What is your Score:");
        int score = input.nextInt();


        System.out.println("Do you have State ID:");

        boolean StateID = input.nextBoolean();


        System.out.println("Do you have Driving exprience :");
        Boolean drivingEx = input.nextBoolean();



        if (age >= 16 && score >= 70 && StateID==true && drivingEx==true) {

            System.out.println("Yes your can get a Driver License");
        } else {
            System.out.println("No you cannot get Driver License");


        }
    }}
